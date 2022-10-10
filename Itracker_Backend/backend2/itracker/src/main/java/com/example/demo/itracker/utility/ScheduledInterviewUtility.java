package com.example.demo.itracker.utility;

import com.example.demo.itracker.entity.Skills;

import javax.persistence.Entity;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ScheduledInterviewUtility {

	private String candidateName;
	private String candidateEmail;
	private String employeeName;
	private String employeeEmail;
	private Date date;
	private Time time;
	private String round;
	private boolean onGoing;
	public ScheduledInterviewUtility() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ScheduledInterviewUtility(String candidateName, String candidateEmail, String employeeName,
			String employeeEmail, Date date, Time time, String round, boolean onGoing, Skills[] skills) {
		super();
		this.candidateName = candidateName;
		this.candidateEmail = candidateEmail;
		this.employeeName = employeeName;
		this.employeeEmail = employeeEmail;
		this.date = date;
		this.time = time;
		this.round = round;
		this.onGoing = onGoing;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public String getCandidateEmail() {
		return candidateEmail;
	}
	public void setCandidateEmail(String candidateEmail) {
		this.candidateEmail = candidateEmail;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
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
	public String getRound() {
		return round;
	}
	public void setRound(String round) {
		this.round = round;
	}
	public boolean getOnGoing() {
		return onGoing;
	}
	public void setOnGoing(boolean onGoing) {
		this.onGoing = onGoing;
	}

}
