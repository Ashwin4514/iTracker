package com.example.demo.itracker.service.JobApplicationService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.itracker.entity.JobApplication;
import com.example.demo.itracker.repository.JobApplicationRepo;
import com.example.demo.itracker.utility.RequestJobApplication;
import com.example.demo.itracker.utility.Response;




@Service
public class JobApplicationService {

	@Autowired
	JobApplicationRepo jobApplicationRepo;

	public List<JobApplication> jobs() {
		return jobApplicationRepo.findAll();
	}

	
	public Response addJob(RequestJobApplication job) {
		Response response = new Response();
		JobApplication jobApplication = null;
		try {
			jobApplication = new JobApplication();
			jobApplication.setJobId(job.getJobId());
			jobApplication.setRole(job.getRole());
			jobApplication.setDescription(job.getDescription());
			jobApplication.setStartDate(job.getStartDate());
			jobApplication.setSkillsRequired(job.getSkillsRequired());
			jobApplication.setVacancies(job.getVacancies());
			jobApplicationRepo.save(jobApplication);
			response.setMessage("Job Added Successfully");
			response.setSuccess(true);
		} catch (Exception ex) {
			response.setMessage(ex.getMessage());
			response.setSuccess(false);
		}
		return response;

	}

	public JobApplication jobById(long id) {
		return jobApplicationRepo.findById(id).orElse(null);
	}

	public List<JobApplication> jobsByRole(String role) {
		List<JobApplication> roleJobs = new ArrayList<JobApplication>();
		List<JobApplication> jobs = jobApplicationRepo.findAll();
		for (JobApplication jobApplication : jobs) {
			if (jobApplication.getRole().equals(role)) {
				roleJobs.add(jobApplication);
			}
		}
		return roleJobs;
	}

	public Response updateJob(RequestJobApplication job) {
		Response response = new Response();
		JobApplication jobApplication = jobApplicationRepo.findById(job.getJobId()).orElse(null);
		try {
			if (jobApplication != null) {
				jobApplication.setJobId(job.getJobId());
				jobApplication.setRole(job.getRole());
				jobApplication.setDescription(job.getDescription());
				jobApplication.setStartDate(job.getStartDate());
				jobApplication.setSkillsRequired(job.getSkillsRequired());
				jobApplication.setVacancies(job.getVacancies());
				jobApplicationRepo.save(jobApplication);
				response.setMessage("Job Information Updated");
				response.setSuccess(true);
			} else {
				throw new Exception("Data Invalid");
			}
		} catch (Exception ex) {
			response.setMessage(ex.getMessage());
			response.setSuccess(false);
		}
		return response;
	}
}