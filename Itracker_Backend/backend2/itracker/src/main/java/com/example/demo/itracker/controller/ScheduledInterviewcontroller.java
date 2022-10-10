package com.example.demo.itracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.itracker.entity.Candidate;
import com.example.demo.itracker.entity.Employee;
import com.example.demo.itracker.entity.ScheduledInterviews;
import com.example.demo.itracker.repository.EmployeeRepository;
import com.example.demo.itracker.service.Candidateservice.Candidateservice;
import com.example.demo.itracker.service.Employee.EmployeeService;
import com.example.demo.itracker.service.ScheduledInterviewsservice.ScheduledInterviewsservice;
import com.example.demo.itracker.utility.ScheduledInterviewUtility;

//public class ScheduledInterviewcontroller {
//
//}

@RestController
public class ScheduledInterviewcontroller {
	@Autowired
	private ScheduledInterviewsservice SIS;
	@Autowired 
	private EmployeeService es;
	
	//Post
		@PostMapping("/recruiter-options/addScheduledInterview")
		public ScheduledInterviews addScheduledInterviews(@RequestBody ScheduledInterviews interviews)
		{
			return SIS.saveScheduledInterviews(interviews);
		}
		
		//Get
		@GetMapping("/getScheduledInterviews")
		public List<ScheduledInterviews>get(){
			return SIS.getScheduledInterviews();
		}

		@GetMapping("/recruiter-options/getScheduledInterviews")
		public List<ScheduledInterviews> getScheduledInterviews()
		{
			return SIS.getScheduledInterviews();
		}
		//get scheduled interviews by date.
		@GetMapping("/recruiter-options/getScheduledInterviewsByDate")
		public List<ScheduledInterviews> getScheduledInterviewsByDate(@RequestParam java.sql.Date date)
		{
			return SIS.getScheduledInterviewsByDate(date);
		}
		@GetMapping("/employee/interview/ongoing/{id}")
		public List<ScheduledInterviewUtility> getListOfOnGoingInterviewsById(@PathVariable String id){
			System.out.println("Controller 1:"+id);
			return SIS.getListOfOnGoingInterviewsById(id);
		}
		@GetMapping("/employee/interview/completed/{id}")
		public List<ScheduledInterviewUtility> getListOfCompletedInterviewsById(@PathVariable String id){
			System.out.println("Controller 2:"+id);
			return SIS.getListOfCompletedInterviewsById(id);
		}
		
		@GetMapping("/recruiter-options/getEmployeeByEmail/{email}")
		public Employee getEmployeeByEmail(@PathVariable String email)
		{
			return es.getEmployeeByEmail(email);
		}
		
		@GetMapping("/recruiter-options/getScheduledInterviewsById/{cid}")
		public List<ScheduledInterviews> getScheduledInterviewsById(@PathVariable long cid)
		{
			return SIS.getScheduledInterviewsById(cid);
		}
		
		

}

