package com.example.demo.itracker.repository;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.itracker.entity.EmployeeSlotAvailability;

public interface EmployeeSlotAvailabilityRepository extends JpaRepository<EmployeeSlotAvailability,Integer>{
	public EmployeeSlotAvailability getByDate(Date date);
	
	@Query("select esa from EmployeeSlotAvailability esa,Employee e WHERE esa.date=:n and e.employeeId=:c")
	public EmployeeSlotAvailability getEmployeeSlotAvailabilityByDateAndEmployeeId(@Param("n")Date date,@Param("c")String employeeId);
}
