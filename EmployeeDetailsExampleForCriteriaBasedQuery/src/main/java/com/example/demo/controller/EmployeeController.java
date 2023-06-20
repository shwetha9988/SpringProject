package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeServiceImpl;
import com.google.gson.Gson;

@RestController
@Validated
public class EmployeeController {
	@Autowired
	EmployeeServiceImpl empService;

	@PostMapping("/save/EmployeeDetails")
	Employee saveEmployeeIntoDb(@RequestBody @Valid Employee empl)
	{
		Employee create=empService.saveEmployee(empl);
		empService.getEmployee();
		return create;
	}
	@GetMapping("/get")
	List<Employee> getEmployeeDetails(){
		return empService.getEmployees();
	}
	@GetMapping("/employee/{firstName}")
	public List<Employee> findByfirstName(@PathVariable @Valid String firstName){
		return empService.findByfirstName(firstName);
	}
	

}
