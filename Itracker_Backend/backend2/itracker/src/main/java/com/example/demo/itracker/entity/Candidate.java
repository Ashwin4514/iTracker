package com.example.demo.itracker.entity;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.example.demo.itracker.entity.JobApplication;

@Entity
public class Candidate {
private String name;
	
	@Id
	@Column(nullable=false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long candidateId;
	
	private String email;
	private String contactNo;
	private String gender;
	private String resumeLink;
	private String PrimeSkill;
	public Candidate() {}
	
	public Candidate(long candidate_Id,String name,String email,String contact_No,String gender,String resumeLink)
	{
		this.candidateId=candidate_Id;
		this.contactNo=contact_No;
		this.email=email;
		this.gender=gender;
		this.name=name;
		this.resumeLink=resumeLink;
	}
	
	//setters:
	public void setResumeLink(String link)
	{
		this.resumeLink=link;
	}

	public void setName(String name)
	{
		this.name=name;
	}
	public void setCandidateID(long cid)
	{
		this.candidateId=cid;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public void setContactNo(String cno)
	{
		this.contactNo=cno;
	}
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	
	//getters:
	
	public String getName()
	{
		return (this.name);
	}
	public long getCandidateID()
	{
		return this.candidateId;
	}
	public String getEmail()
	{
		return this.email;
	}
	public String getContactNo()
	{
		return this.contactNo;
	}
	public String getGender()
	{
		return this.gender;
	}

	public String getResumeLink()
	{
		return this.resumeLink;
	}

	public long getCandidateId() {return candidateId;}

	public void setCandidateId(long candidateId) {this.candidateId = candidateId;}

	public String getPrimeSkill() {return PrimeSkill;}

	public void setPrimeSkill(String primeSkill) {PrimeSkill = primeSkill;}
}
