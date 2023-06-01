package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.dto.EmployeeDetailsDto;
import com.employee.entity.EmployeeDetails;
import com.employee.service.EmployeeDetailsService;

@RequestMapping("/employee")
@RestController

public class EmployeeDetailsController {
	@Autowired
	EmployeeDetailsService employeeDetailsService;

	
	@PostMapping("/create")
	public String createEmployee(@RequestBody EmployeeDetailsDto data) {
		
		return employeeDetailsService.createEmployee(data);
	}
	
	@GetMapping("/all")
	public List<EmployeeDetails>  getEmployeeDetails() {
		return employeeDetailsService.getEmployeeDetails();
	}
	
}