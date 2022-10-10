package com.example.demo.itracker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.itracker.entity.EmployeeSkill;

public interface EmployeeSkillRepository extends JpaRepository<EmployeeSkill,Integer>{

	public List<EmployeeSkill> findBySkillId(int skillId);
	public List<EmployeeSkill> findByEmployeeId(String employeeId);
	
	@Query("select es from EmployeeSkill es WHERE es.skillId=:n and es.employeeId=:c")
	public EmployeeSkill getEmployeeSkillBySkillIdAndEmployeeId(@Param("n")int skillId,@Param("c")String employeeId); 
}