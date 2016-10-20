package co.edu.udea.iw.dto;

import java.util.Date;

/**
 * 
 * @author Santiago
 *
 */

public class Employee {
	
	String id;
	String name;
	String lastname;
	double salary;
	String email;
	Date startDate;
	String password;
	
	public Employee() {
		super();
	}

	public Employee(String id, String name, String lastname, double salary, String email, Date startDate,
			String password) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.salary = salary;
		this.email = email;
		this.startDate = startDate;
		this.password = password;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	 
	 
	
	
	
}
