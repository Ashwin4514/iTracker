package com.example.demo.itracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.itracker.entity.Candidate;
import com.example.demo.itracker.entity.CandidateFeedback;

public interface CandidateFeedbackRepository extends JpaRepository<CandidateFeedback ,Long>{
//	public Candidate getByCandidateName(String candidateName);
//	public Candidate getByEmail(String email);
}
