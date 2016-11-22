


SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


-- Base de datos: `pqrsDB`
--
CREATE DATABASE `pqrsDB` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `pqrsDB`;





CREATE TABLE employee (
 id VARCHAR(255) PRIMARY KEY ,
 name VARCHAR(255) NOT NULL,
 last_name VARCHAR(255) NOT NULL,
 salary DOUBLE NOT NULL,
 email VARCHAR(255) NOT NULL,
 start_date DATE NOT NULL,
 password VARCHAR(255) NOT NULL
);

CREATE TABLE report_type (
 id VARCHAR(255) PRIMARY KEY AUTO_INCREMENT,
 name VARCHAR(255) NOT NULL
);

CREATE TABLE user (
 id VARCHAR(255) PRIMARY KEY ,
 name VARCHAR(255) NOT NULL,
 phone VARCHAR(255),
 city VARCHAR(255) NOT NULL,
 last_name VARCHAR(255) NOT NULL,
 password VARCHAR(255) NOT NULL,
 email VARCHAR(255) NOT NULL
);

CREATE TABLE report 
(
 id INT NOT NULL AUTO_INCREMENT,
 description LONGTEXT NOT NULL,
 status VARCHAR(255) NOT NULL,
 id_report_type VARCHAR(255) NOT NULL,
 id_emp VARCHAR(255) ,
 id_user VARCHAR(255) NOT NULL,
 create_date DATE NOT NULL,
 response LONGTEXT,
 Primary key (id) 
)
;

CREATE INDEX idx_report__id_emp ON report (id_emp);

CREATE INDEX idx_report__id_rt ON report (id_rt);

CREATE INDEX idx_report__id_user ON report (id_user);

ALTER TABLE report ADD CONSTRAINT fk_report__id_emp FOREIGN KEY (id_emp) REFERENCES employee (id);

ALTER TABLE report ADD CONSTRAINT fk_report__id_rt FOREIGN KEY (id_rt) REFERENCES report_type (id);

ALTER TABLE report ADD CONSTRAINT fk_report__id_user FOREIGN KEY (id_user) REFERENCES user (id);



INSERT INTO report_type(id, name) VALUES ("1","Petición");
INSERT INTO report_type(id, name) VALUES ("2","Queja");
INSERT INTO report_type(id, name) VALUES ("3","Reclamo");
INSERT INTO report_type(id, name) VALUES ("4","Solicitud");


INSERT INTO employee VALUES ("1","Pepe","Perez",10000.0,"pepito@gmail.com","2015-03-12","qwerty");
INSERT INTO employee VALUES ("2","Catalina","Rengifo",10.5,"catalina@gmail.com","2015-04-4","password");
INSERT INTO employee VALUES ("3","Alejandra","Rendon",50000.1,"aleja@gmail.com","2015-05-12","contra");
INSERT INTO employee VALUES ("4","Camilo","Aveñando",30000.1,"camilo@gmail.com","2014-03-01","sena");
INSERT INTO employee VALUES ("5","Manuel","Artemio",311231.5,"manuel@hotmail.com","2014-03-04","123");
INSERT INTO employee VALUES ("6","Sergio","Ospina",41231.6,"checho@gmail.com","2014-02-21","12345");


INSERT INTO user VALUES ("1","Pedro","2282858","medellin","Dominguez","987654","mguillermo.ochoa@udea.edu.coxD");
INSERT INTO user VALUES ("2","Andres","3052485852","Bogota","Rodriguez","123456","noresponder@yahoo.es");
INSERT INTO user VALUES ("10","Camila","6522858","lejos","Largo","456123","nomelose@live.com");
INSERT INTO user VALUES ("20","Elisa","858","muy lejos","tutucuerpo","654123","que@gmail.com");


INSERT INTO report VALUES ("1","mucha demora para realizar el chekIn en el aeropuerto","pendiente","1","1","1","2016-10-17","");
INSERT INTO report VALUES ("2","Deberían de ponerle 5 a estos muchachos desarrolladores","Pendiente","1","1","1","2016-10-17","");

