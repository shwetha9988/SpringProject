package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.EmployeeDepartmentDetails;
import com.example.demo.service.EmployeeDepartmentDetailsService;

@RestController  
public class EmployeeDepartmentDetailsController {
@Autowired
EmployeeDepartmentDetailsService service;
@PostMapping("/save/DepartmentDetails")
EmployeeDepartmentDetails saveDepartmentDetailsIntoDb(@RequestBody EmployeeDepartmentDetails details) {
	return service.saveDepartmentDetails(details);
}
}
