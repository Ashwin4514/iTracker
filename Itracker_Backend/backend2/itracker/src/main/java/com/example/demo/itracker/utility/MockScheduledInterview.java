package com.example.demo.itracker.utility;

import java.sql.Date;
import java.sql.Time;

public class MockScheduledInterview {

	private Long interviewId;
	private String date;
	private String time;
	private String round;
	private String candidateName;
	private String email;
	private String employeeId;
	private boolean onGoing;
	
	
	
	public MockScheduledInterview() {
		super();
		// TODO Auto-generated constructor stub
	}



	public MockScheduledInterview(Long interviewId, String date, String time, String round, String candidateName,
			String email, String employeeId, boolean onGoing) {
		super();
		this.interviewId = interviewId;
		this.date = date;
		this.time = time;
		this.round = round;
		this.candidateName = candidateName;
		this.email = email;
		this.employeeId = employeeId;
		this.onGoing = onGoing;
	}



	public Long getInterviewId() {
		return interviewId;
	}



	public void setInterviewId(Long interviewId) {
		this.interviewId = interviewId;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public String getTime() {
		return time;
	}



	public void setTime(String time) {
		this.time = time;
	}



	public String getRound() {
		return round;
	}



	public void setRound(String round) {
		this.round = round;
	}



	public String getCandidateName() {
		return candidateName;
	}



	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getEmployeeId() {
		return employeeId;
	}



	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}



	public boolean isOnGoing() {
		return onGoing;
	}



	public void setOnGoing(boolean onGoing) {
		this.onGoing = onGoing;
	}
	

}
