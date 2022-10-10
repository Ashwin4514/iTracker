package com.example.demo.itracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.itracker.entity.CandidateFeedback;
import com.example.demo.itracker.repository.CandidateFeedbackRepository;
import com.example.demo.itracker.repository.CandidateRepo;
import com.example.demo.itracker.utility.Response;

@RestController
@RequestMapping("/candidateFeedback")
public class CandidateFeedbackController {

	@Autowired
	private CandidateFeedbackRepository repo;
	@Autowired
	private CandidateRepo candidateRepo;
	@PostMapping
	public  Response add(@RequestBody CandidateFeedback candidateFeedback) {
		Response response=new Response();
		try {
			String name=candidateFeedback.getCandidateName();
			if(candidateRepo.findByName(name)==null) throw new Exception("Invalid Candidate Name , Check candidate name in Scheduled Interview Table to see the correct candidate name");
			String email=candidateFeedback.getEmail();
			if(candidateRepo.findByEmail(email)==null) throw new Exception("Invalid Candidate Email , Check candidate email in Scheduled Interview Table to see the correct candidate email");
			repo.save(candidateFeedback);
			response.setMessage("Candidate feedback added successfully");
			response.setSuccess(true);
		}
		catch(Exception e) {
			response.setSuccess(false);
			response.setMessage(e.getMessage());
		}
		return response;
	}
	@GetMapping("/")
	public List<CandidateFeedback> get()
	{
		return repo.findAll();
	}
}
