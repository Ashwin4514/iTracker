package com.example.demo.itracker.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class CandidateFeedback {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long feedbackId;
	private String candidateName;
	private String email;
	private int score;
	private String comments;
	private String status;
	private String round;
	public CandidateFeedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CandidateFeedback(Long feedbackId, String candidateName, String email, int score, String comments,
			String status, String round) {
		super();
		this.feedbackId = feedbackId;
		this.candidateName = candidateName;
		this.email = email;
		this.score = score;
		this.comments = comments;
		this.status = status;
		this.round = round;
	}
	public Long getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(Long feedbackId) {
		this.feedbackId = feedbackId;
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
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRound() {
		return round;
	}
	public void setRound(String round) {
		this.round = round;
	}
	
	
	
}
