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
	 String last_name;
	 double salary;
	 String email;
	 Date start_date;
	 String password;
	 
	public Employee(String id, String name, String last_name, double salary, String email, Date start_date,
			String password) {
		super();
		this.id = id;
		this.name = name;
		this.last_name = last_name;
		this.salary = salary;
		this.email = email;
		this.start_date = start_date;
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
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
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
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	 
	 
	
	
	
}
