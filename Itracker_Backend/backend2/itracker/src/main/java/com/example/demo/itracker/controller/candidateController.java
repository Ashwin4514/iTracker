package com.example.demo.itracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.itracker.entity.Candidate;
import com.example.demo.itracker.service.Candidateservice.Candidateservice;

@RestController
public class candidateController {
	@Autowired
	private Candidateservice cs;
	
	//post methods
	
	@PostMapping("/recruiter-options/addCandidate")
	public Candidate addCandidate(@RequestBody Candidate candidate)
	{
		return cs.saveCandidate(candidate);
	}
//	@PostMapping("/recruiter-options/addCandidates")
//	public List<Candidate> addCandidates(@RequestBody List<Candidate> candidates)
//	{
//		return cs.saveCandidates(candidates);
//	}
	
	//get methods
	@GetMapping("/recruiter-options/findCandidates")
	public List<Candidate> findCandidates()
	{
		return cs.getCandidates();
	}
	@GetMapping("/recruiter-options/findCandidateById/{Id}")
	public Candidate findCandidateById(@PathVariable Long Id)
	{
		return cs.getCandidateById(Id);
	}
	@GetMapping("/recruiter-options/findCandidateByName/{name}")
	public Candidate findCandidateByName(@PathVariable String name)
	{
		return cs.getCandidateByName(name);
	}
	@GetMapping("/recruiter-options/findCandidateByEmail/{email}")
	public Candidate findCandidateByEmail(@PathVariable String email)
	{
		return cs.getCandidateByEmail(email);
	}
	//put
	
	@PutMapping("/recruiter-options/updateCandidate")
	public Candidate updateCandidate(@RequestBody Candidate candidate)
	{
		return cs.updateCandidate(candidate);
	}
	
	//delete
	@DeleteMapping("/recruiter-options/deleteCandidate")
	public void deleteCandidate(@RequestParam long id)
	{
		cs.CandidateRemove(id);
	}
	
//	@RequestMapping(value="/recruiter-options/findCandidatesBySkills/{skills}", method=RequestMethod.GET)
//	@ResponseBody
//	public List<Candidate> findCandidatesBySkills(@PathVariable String[] skills)
//	{
//		return cs.getCandidatesBySkills(skills);
//	}
	
	

}