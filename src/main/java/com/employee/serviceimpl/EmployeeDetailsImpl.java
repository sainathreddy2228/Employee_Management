package com.employee.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dto.EmployeeDetailsDto;
import com.employee.entity.EmployeeDetails;
import com.employee.repository.EmployeeDetailsRepository;
import com.employee.service.EmployeeDetailsService;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class EmployeeDetailsImpl implements EmployeeDetailsService {
	
	@Autowired
	EmployeeDetailsRepository empDetailsRepo;
	
	
	public String createEmployee(EmployeeDetailsDto data) {
		EmployeeDetails emp=new EmployeeDetails();
		emp.setEmpCity(data.getEmpCity());
		emp.setEmpName(data.getEmpName());
		emp.setEmpSalary(Integer.parseInt(data.getEmpSalary()));
		emp.setEmpDepartment(data.getEmpDepartment());
		empDetailsRepo.save(emp);
		return "Created Sucessfully";
	}
	public List<EmployeeDetails>  getEmployeeDetails() {
		List<EmployeeDetailsDto> list=new ArrayList<>();
		List<EmployeeDetails> empd=empDetailsRepo.findAll();
		for(EmployeeDetails empdetails:empd) {
			EmployeeDetailsDto dto=new EmployeeDetailsDto();	
			dto.setEmpCity(empdetails.getEmpCity());
			dto.setEmpDepartment(empdetails.getEmpDepartment());
			dto.setEmpName(empdetails.getEmpName());
			dto.setEmpSalary(empdetails.getEmpSalary().toString());
			list.add(dto);
		}
		
		return empd;
	}
	
}
