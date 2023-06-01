package com.employee.service;

import java.util.List;

import com.employee.dto.EmployeeDetailsDto;
import com.employee.entity.EmployeeDetails;

public interface EmployeeDetailsService {
	public String createEmployee(EmployeeDetailsDto data);
	public List<EmployeeDetails>  getEmployeeDetails();
}
