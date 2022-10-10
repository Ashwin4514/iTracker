package com.example.demo.itracker.controller;

import java.util.List;

import com.example.demo.itracker.service.EmployeeSkillsService.EmployeeSkillsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.itracker.entity.EmployeeSkill;
import com.example.demo.itracker.entity.Skills;
import com.example.demo.itracker.service.EmployeeSkillsService.EmployeeSkillsService;
import com.example.demo.itracker.utility.RequestBodyEmployeeSkills;
import com.example.demo.itracker.utility.Response;

@RestController
@RequestMapping("/api/v1/employee/skill/")
//public class EmployeeSkillController {
//
//	@Autowired
//	EmployeeSkillsService employeeSkillsService;
//	@PostMapping()
//	public Response addSkill(@RequestBody RequestBodyEmployeeSkills rq ) {
//		
//		return employeeSkillsService.addSkill(rq);
//	}
//	
//	@GetMapping("s_id/{id}")
//	public List<EmployeeSkill> getListOfEmployeeBySkill(@PathVariable(name="id") int skillId)
//	{
//		return employeeSkillsService.getListOfEmployeeBySkill(skillId);
//	}
//	
//	@GetMapping("e_id/{id}")
//	public List<EmployeeSkill> getListOfEmployeeByEmployeeId(@PathVariable(name="id") String employeeId)
//	{
//		return employeeSkillsService.getListOfEmployeeByEmployeeId(employeeId);
//	}
//	
//	@GetMapping()
//	public List<EmployeeSkill> getAll()
//	{
//		return employeeSkillsService.getAll();
//	}
//	
//
//}

public class EmployeeSkillController {

	@Autowired
	EmployeeSkillsService employeeSkillsService;

	@Autowired
	EmployeeSkillsServiceImpl employeeSkillsServiceimpl;
	
	@PostMapping()
	public Response addSkill(@RequestBody RequestBodyEmployeeSkills rq ) {
		
		return employeeSkillsService.addSkill(rq);
	}
	
	@GetMapping("s_id/{id}")
	public List<EmployeeSkill> getListOfEmployeeBySkill(@PathVariable(name="id") int skillId)
	{
		return employeeSkillsService.getListOfEmployeeBySkill(skillId);
	}
	
	@GetMapping("e_id/{id}")
	public List<EmployeeSkill> getListOfEmployeeByEmployeeId(@PathVariable(name="id") String employeeId)
	{
		return employeeSkillsService.getListOfEmployeeByEmployeeId(employeeId);
	}
	
	@GetMapping()
	public List<EmployeeSkill> getAll()
	{
		return employeeSkillsService.getAll();
	}

	@GetMapping("s_id")
	public List<EmployeeSkill> getAllEmployeeSkills()
	{
		return employeeSkillsServiceimpl.getAllEmployeeSkills();
	}

	@DeleteMapping("r_id/{id}")
	public Response delete(@PathVariable(name = "id") int id)
	{
		return employeeSkillsService.deleteSkill(id);
	}

//	@PutMapping("i_id/{id}")
//	public Response update(@PathVariable int id, RequestBodyEmployeeSkills rq){
//		return employeeSkillsService.updateSkill(id,rq);
//	}

	@GetMapping("/showAll")
	public List<Skills> getAllSkills(){
		return employeeSkillsService.getAllSkills();
	}



}
