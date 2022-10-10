package com.example.demo.itracker.service.ScheduledInterviewsservice;

import javax.persistence.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.itracker.entity.Candidate;
import com.example.demo.itracker.entity.Employee;
import com.example.demo.itracker.entity.ScheduledInterviews;
import com.example.demo.itracker.repository.CandidateRepo;
import com.example.demo.itracker.repository.EmployeeRepository;
import com.example.demo.itracker.repository.ScheduledInterviewsRepository;
import com.example.demo.itracker.utility.ScheduledInterviewUtility;
@Service
public class ScheduledInterviewsservice {
	@Autowired
	private ScheduledInterviewsRepository SIR;
	//Post
	@Autowired
	private CandidateRepo candidateRepo;
	@Autowired
	private EmployeeRepository employeeRepo;
	
	public ScheduledInterviews saveScheduledInterviews(ScheduledInterviews interviews)
	{
		interviews.setOnGoing(true);
		return SIR.save(interviews);
	}
	
	//Get
	public List<ScheduledInterviewUtility> get_ScheduledInterviews(){
		List<ScheduledInterviews> list;
		list=(List<ScheduledInterviews>) SIR.findAll();
		List<ScheduledInterviewUtility> siu=new LinkedList<>();
		for(ScheduledInterviews s : list)
		{
			System.out.println("candidate id" + s.getCandidateId());
			Optional<Candidate> optional1=candidateRepo.findById(s.getCandidateId());
			System.out.println("Optional is" + optional1.isPresent());
			Candidate c=optional1.get();
			Optional<Employee> optional2=employeeRepo.findById(s.getEmpId());
			Employee e=optional2.get();
			ScheduledInterviewUtility obj=new ScheduledInterviewUtility();
			obj.setCandidateName(c.getName());
			obj.setCandidateEmail(c.getEmail());
			obj.setEmployeeEmail(e.getEmail());
			obj.setEmployeeName(e.getName());
			obj.setDate(s.getDate());
			obj.setTime(s.getTime());
			obj.setRound(s.getRound());
			siu.add(obj);
		}
		return siu;
	}
	public List<ScheduledInterviews> getScheduledInterviews()
	{
		return (List<ScheduledInterviews>) SIR.findAll();
	}
	public List<ScheduledInterviews> getListOfOnGoingInterviews(){
		List<ScheduledInterviews> scheduledInterviews=(List<ScheduledInterviews>) SIR.findAll();
		List<ScheduledInterviews> onGoing=new LinkedList<>();
		for(ScheduledInterviews si:scheduledInterviews) {
			if(si.getOnGoing()) {
				onGoing.add(si);
			}
		}
		return onGoing;
		
	}
	public List<ScheduledInterviewUtility> getListOfOnGoingInterviewsById(String employeeId){
//		List<ScheduledInterviews> scheduledInterviews=(List<ScheduledInterviews>) SIR.findByEmpId(employeeId);
//		System.out.println("List :"+scheduledInterviews);
//		List<ScheduledInterviews> onGoing=new LinkedList<>();
//		for(ScheduledInterviews si:scheduledInterviews) {
//			if(si.getOnGoing()) {
//				onGoing.add(si);
//			}
//		}
//		return onGoing;
		List<ScheduledInterviewUtility> list=this.helper(employeeId);
		List<ScheduledInterviewUtility> onGoing=new LinkedList<>();
		for(ScheduledInterviewUtility siu:list) {
			if(siu.getOnGoing()) {
				onGoing.add(siu);
			}
		}
		return onGoing;
	}
	public List<ScheduledInterviews> getListOfCompletedInterviews(){
		List<ScheduledInterviews> scheduledInterviews=(List<ScheduledInterviews>) SIR.findAll();
		List<ScheduledInterviews> completed=new LinkedList<>();
		for(ScheduledInterviews si:scheduledInterviews) {
			if(!si.getOnGoing()) {
				completed.add(si);
			}
		}
		return completed;
	}
	public List<ScheduledInterviewUtility> helper(String employeeId){
		List<ScheduledInterviews> list;
		list=(List<ScheduledInterviews>) SIR.findByEmpId(employeeId);
		List<ScheduledInterviewUtility> siu=new LinkedList<>();
		for(ScheduledInterviews s : list)
		{
			System.out.println("candidate id" + s.getCandidateId());
			Optional<Candidate> optional1=candidateRepo.findById(s.getCandidateId());
			System.out.println("Optional is" + optional1.isPresent());
			Candidate c=optional1.get();
			Optional<Employee> optional2=employeeRepo.findById(s.getEmpId());
			Employee e=optional2.get();
			ScheduledInterviewUtility obj=new ScheduledInterviewUtility();
			obj.setCandidateName(c.getName());
			obj.setCandidateEmail(c.getEmail());
			obj.setEmployeeEmail(e.getEmail());
			obj.setEmployeeName(e.getName());
			obj.setDate(s.getDate());
			obj.setTime(s.getTime());
			obj.setRound(s.getRound());
			obj.setOnGoing(s.getOnGoing());
			siu.add(obj);
		}
		return siu;
	}
	public List<ScheduledInterviewUtility> getListOfCompletedInterviewsById(String employeeId){
//		System.out.println("EmployeeId :"+employeeId);
//		List<ScheduledInterviews> scheduledInterviews=(List<ScheduledInterviews>) SIR.findByEmpId(employeeId);
//		List<ScheduledInterviews> completed=new LinkedList<>();
//		for(ScheduledInterviews si:scheduledInterviews) {
//			if(!si.getOnGoing()) {
//				completed.add(si);
//			}
//		}
//		return completed;
		List<ScheduledInterviewUtility> list=this.helper(employeeId);
		List<ScheduledInterviewUtility> completed=new LinkedList<>();
		for(ScheduledInterviewUtility siu:list) {
			if(!siu.getOnGoing()) {
				completed.add(siu);
			}
		}
		return completed;
		
	}
	//get scheduled interviews by date.
	public List<ScheduledInterviews> getScheduledInterviewsByDate(java.sql.Date date)
	{
		List<ScheduledInterviews> list=new ArrayList<ScheduledInterviews>();
		 SIR.findAll().forEach((p) -> {
	            if(p.getDate() == date)
	            	list.add(p);
	        });
		return list;
	}
	//get scheduled interview by cid
	public List<ScheduledInterviews> getScheduledInterviewsById(long cid)
	{
		List<ScheduledInterviews> list=new ArrayList<ScheduledInterviews>();
		 SIR.findAll().forEach((p) -> {
	            if(p.getCandidateId() == cid)
	            	list.add(p);
	        });
		 System.out.println("size of list :" + list.size());
		return list;
	}
}
