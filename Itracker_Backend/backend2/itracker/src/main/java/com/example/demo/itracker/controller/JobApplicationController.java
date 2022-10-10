package com.example.demo.itracker.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.itracker.service.JobApplicationService.JobApplicationService;
import com.example.demo.itracker.utility.RequestJobApplication;
import com.example.demo.itracker.utility.Response;
import com.example.demo.itracker.entity.*;

@RestController
@RequestMapping("/employee")
public class JobApplicationController {

	@Autowired
	JobApplicationService jobApplicationService;
	public JobApplicationController() {
		
	}

	@GetMapping("/jobs")
	public List<JobApplication> getJobs()
	{
		return jobApplicationService.jobs();
	}	
	
	@GetMapping("/jobId/{id}")
	public JobApplication getJobByID(@PathVariable Long id)
	{
		return jobApplicationService.jobById(id);
	}
	
	
	@GetMapping("jobRole/{role}")
	public List<JobApplication> getJobsByRole(@PathVariable String role)
	{
		return jobApplicationService.jobsByRole(role);
	}
	
	@PostMapping("/job")
	public Response postJob(@RequestBody RequestJobApplication job)
	{
			return jobApplicationService.addJob(job);
	}
	
	@PutMapping("/job")
	public Response updateJob(@RequestBody RequestJobApplication job)
	{
			return jobApplicationService.updateJob(job);
		
	}	
}
