package com.example.demo.itracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.itracker.entity.Candidate;



public interface CandidateRepo extends JpaRepository<Candidate,Long>{
	Candidate findByName(String name);
	Candidate findByEmail(String email);
}
