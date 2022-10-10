package com.example.demo.itracker.controller;

import java.sql.Date;
import java.sql.Time;
import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.itracker.utility.MockScheduledInterview;

@RestController
@RequestMapping("/api/v1/scheduledInterview/")
public class MockScheduledInterviewController {

	@GetMapping("onGoing")
	public List<MockScheduledInterview> getOnGoing()
	{
		MockScheduledInterview interview1,interview2,interview3,interview4,interview5,interview6,interview7,interview8,interview9,interview10;
		interview6=new MockScheduledInterview(106L,"8-04-2022","10:00:00","R1","Gagan Joshi","joshigagan@gmail.com","INT1027",true);
		interview7=new MockScheduledInterview(107L,"9-04-2022","10:00:00","R2","Harsh Tarachandani","harshtarachandani99@gmail.com","INT1027",true);
	
		
//		interview2=new MockScheduledInterview(102L,null,null,"R2",902L,"INT1027");
		List<MockScheduledInterview> list=new LinkedList<>();
		list.add(interview6);
		list.add(interview7);
		
		return list;
	}
	
	@GetMapping("completed")
	public List<MockScheduledInterview> getScheduled()
	{MockScheduledInterview interview1,interview2,interview3,interview4,interview5,interview6,interview7,interview8,interview9,interview10;
	interview1=new MockScheduledInterview(101L,"3-03-2022","10:00:00","R1","Akshat Jain","akshatjain2000@gmail.com","INT1027",false);
	
	List<MockScheduledInterview> list=new LinkedList<>();
	list.add(interview1);
	return list;
		
		
		
	}
	
}
