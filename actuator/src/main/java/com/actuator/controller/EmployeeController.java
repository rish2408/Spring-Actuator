package com.actuator.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.actuator.bean.Employee;

@RestController
public class EmployeeController {

	@GetMapping("/employees")
	public List<Employee> getAllEmployeeDetails(){
		
		return List.of(
				new Employee(1, "Rishabh Srivastava", "Lucknow"),
				new Employee(2, "Mansi Soni", "Noida"),
				new Employee(3, "Happy Singh", "Pune")
				);
	}
}
