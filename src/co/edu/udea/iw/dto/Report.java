package co.edu.udea.iw.dto;

import java.util.Date;

/**
 * 
 * @author Santiago
 *
 */

public class Report {
	 String id;
	 String description;
	 String status;
	 ReportType id_rt;
	 Employee id_emp;
	 User id_user;
	 Date create_date; // se le debe pasar la hora actual del servidor en el constructor no deberia de ir
	 
	public Report(String id, String description, String status, ReportType id_rt, Employee id_emp, User id_user,
			Date create_date) {
		super();
		this.id = id;
		this.description = description;
		this.status = status;
		this.id_rt = id_rt;
		this.id_emp = id_emp;
		this.id_user = id_user;
		this.create_date = create_date;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public ReportType getId_rt() {
		return id_rt;
	}
	public void setId_rt(ReportType id_rt) {
		this.id_rt = id_rt;
	}
	public Employee getId_emp() {
		return id_emp;
	}
	public void setId_emp(Employee id_emp) {
		this.id_emp = id_emp;
	}
	public User getId_user() {
		return id_user;
	}
	public void setId_user(User id_user) {
		this.id_user = id_user;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	 
	 
	 

}
