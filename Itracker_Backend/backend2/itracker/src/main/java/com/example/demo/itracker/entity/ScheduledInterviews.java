package com.example.demo.itracker.entity;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ScheduledInterviews {
	@Id
	@Column(nullable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long sno;
	
	private String empId;

	private long candidateId;
	private java.sql.Date date;
	private java.sql.Time time;
	private String round;
	private boolean onGoing;
	public ScheduledInterviews() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ScheduledInterviews(long sno, String empId, long candidateId, Date date, Time time, String round,
			boolean onGoing) {
		super();
		this.sno = sno;
		this.empId = empId;
		this.candidateId = candidateId;
		this.date = date;
		this.time = time;
		this.round = round;
		this.onGoing = onGoing;
	}
	public long getSno() {
		return sno;
	}
	public void setSno(long sno) {
		this.sno = sno;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public long getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(long candidateId) {
		this.candidateId = candidateId;
	}
	public java.sql.Date getDate() {
		return date;
	}
	public void setDate(java.sql.Date date) {
		this.date = date;
	}
	public java.sql.Time getTime() {
		return time;
	}
	public void setTime(java.sql.Time time) {
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