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
	 ReportType idReportType;
	 Employee idEmployee;
	 User idUser;
	 Date createDate; // se le debe pasar la hora actual del servidor en el constructor no deberia de ir
	 String response;
	 
	public Report(String id, String description, String status, ReportType idReportType, Employee idEmployee, User idUser,
			Date createDate) {
		super();
		this.id = id;
		this.description = description;
		this.status = status;
		this.idReportType = idReportType;
		this.idEmployee = idEmployee;
		this.idUser = idUser;
		this.createDate = createDate;
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
	public ReportType getidReportType() {
		return idReportType;
	}
	public void setidReportType(ReportType idReportType) {
		this.idReportType = idReportType;
	}
	public Employee getidEmployee() {
		return idEmployee;
	}
	public void setidEmployee(Employee idEmployee) {
		this.idEmployee = idEmployee;
	}
	public User getidUser() {
		return idUser;
	}
	public void setidUser(User idUser) {
		this.idUser = idUser;
	}
	public Date getcreateDate() {
		return createDate;
	}
	public void setcreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	
	
	 
	 

}
