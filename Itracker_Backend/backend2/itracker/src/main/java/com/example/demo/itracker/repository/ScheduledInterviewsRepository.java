package com.example.demo.itracker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.example.demo.itracker.entity.ScheduledInterviews;

public interface ScheduledInterviewsRepository extends JpaRepository<ScheduledInterviews,Long> {
	public List<ScheduledInterviews> findByEmpId(String emp_id);
}
