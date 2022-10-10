package com.example.demo.itracker.utility;

import java.sql.Date;
import java.sql.Time;

public class EmployeeSlotDetailsUtility {

	private String employeeId;
	private String name;
	private String email;
	private Date date;
	private Time time;
	public EmployeeSlotDetailsUtility() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeSlotDetailsUtility(String employeeId, String name, String email, Date date, Time time) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.email = email;
		this.date = date;
		this.time = time;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	
}
