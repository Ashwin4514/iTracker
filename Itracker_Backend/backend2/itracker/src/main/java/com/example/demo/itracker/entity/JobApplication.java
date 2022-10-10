package com.example.demo.itracker.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class JobApplication {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long jobId;
	private String role;
	private String description;
	private Date startDate;
	private long vacancies;
	private String skillsRequired;
	
	public long getJobId() {
		return jobId;
	}

	public void setJobId(long jobId) {
		this.jobId = jobId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public long getVacancies() {
		return vacancies;
	}

	public void setVacancies(long vacancies) {
		this.vacancies = vacancies;
	}

	public String getSkillsRequired() {
		return skillsRequired;
	}

	public void setSkillsRequired(String skillsRequired) {
		this.skillsRequired = skillsRequired;
	}

	public JobApplication(long jobId, String role, String description, Date startDate, long vacancies,
			String skillsRequired) {
		super();
		this.jobId = jobId;
		this.role = role;
		this.description = description;
		this.startDate = startDate;
		this.vacancies = vacancies;
		this.skillsRequired = skillsRequired;
	}

	public JobApplication() {
		super();
	}

}
