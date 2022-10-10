package com.example.demo.itracker.service.Candidateservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.itracker.entity.Candidate;
import com.example.demo.itracker.repository.CandidateRepo;
import com.example.demo.itracker.repository.SkillRepository;

@Service
public class Candidateservice {

	@Autowired
	private CandidateRepo cres;
	@Autowired
	private SkillRepository sr;
	
	//Post
	public Candidate saveCandidate(Candidate candidate)
	{
		return cres.save(candidate);
	}
	
	
	//Get
	public List<Candidate> getCandidates()
	{
		return cres.findAll();
	}
	//get Candidate by Candidate Id
	public Candidate getCandidateById(long id)
	{
		return cres.findById(id).orElse(null);
	}
	//get Candidate by Candidate name
	public Candidate getCandidateByName(String name)
	{
		return cres.findByName(name);
	}
	public Candidate getCandidateByEmail(String email)
	{
		return cres.findByEmail(email);
	}
	//get candidates by skills
//	public List<Candidate> getCandidatesBySkills(String [] skills)
//	{
//		List<Candidate> lis=new ArrayList<Candidate>();
//		//List<Long> skillids=new ArrayList<Long>();
//		HashMap<String,Long> my_map=new HashMap<String,Long>();
//		HashMap<Long,Long> skillids=new HashMap<Long,Long>();
//		HashMap<Long,Long> candids=new HashMap<Long,Long>();
//		long i=0;
//		//adding all skills to hashmap
//		 for (String c : skills)
//		 {
//	         if (my_map.containsKey(c))
//	         {
//	            my_map.put(c, my_map.get(c) + 1);
//	         }
//	         else
//	         {
//	            my_map.put(c,(long)1);
//	         }
//	      }
//		 sr.findAll().forEach((p) -> {
//	            if(my_map.containsKey(p.getSkillName()))
//	            {
//	            	 if (skillids.containsKey(p.getSkillId()))
//	    	         {
//	            		 skillids.put(p.getSkillId(), skillids.get(p.getSkillId()) + 1);
//	    	         }
//	    	         else
//	    	         {
//	    	        	 skillids.put(p.getSkillId(),(long)1);
//	    	         }
//	            }
//	            	//skillids.add(p.getSkillId());
//	        });
//		 csr.findAll().forEach((p) -> {
//	            if(skillids.containsKey(p.getSkillId()))
//	            {
//	            	if (candids.containsKey(p.getCandidateId()))
//	    	         {
//	            		 candids.put(p.getCandidateId(), candids.get(p.getCandidateId()) + 1);
//	    	         }
//	    	         else
//	    	         {
//	    	        	 candids.put(p.getCandidateId(),(long)1);
//	    	         }
//	            }
//	        });
//		 cres.findAll().forEach((p) -> {
//	            if(candids.containsKey(p.getCandidateID()))
//	            	lis.add(p);
//	        });
//		 /*
//		 cres.findAll().forEach((p) -> {
//	            if(my_map.containsKey(p.getSkillName()))
//	            	lis.add(p);
//	        });
//	        */
//		return lis;
//	}
	//delete
	public String CandidateRemove(long id)
	{
		cres.deleteById(id);
		return ("Candidate with id " + id + "removed");
	}
	//update
	
	public Candidate updateCandidate(Candidate cd)
	{
		Candidate currentCandidate=cres.findById(cd.getCandidateID()).orElse(null);
		currentCandidate.setCandidateID(cd.getCandidateID());
		currentCandidate.setContactNo(cd.getContactNo());
		currentCandidate.setEmail(cd.getEmail());
		currentCandidate.setGender(cd.getGender());
		currentCandidate.setName(cd.getName());
		currentCandidate.setResumeLink(cd.getResumeLink());
		return cres.save(currentCandidate);
	}
	

}

