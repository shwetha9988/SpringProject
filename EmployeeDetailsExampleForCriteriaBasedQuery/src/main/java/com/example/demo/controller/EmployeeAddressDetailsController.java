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

import com.example.demo.model.EmployeeAddressDetails;
import com.example.demo.service.EmployeeAddressDetailsServiceImpl;

@RestController
@Validated
public class EmployeeAddressDetailsController {
	@Autowired
	EmployeeAddressDetailsServiceImpl service;
	@PostMapping("/save/AddressDetails")
	EmployeeAddressDetails saveAddressIntoDb(@RequestBody @Valid EmployeeAddressDetails details) {
		return service.saveAddressDetails(details);
	}
	
	@GetMapping("/getById")
	List<EmployeeAddressDetails> getAdressById() {
		return service.getAddressDetails();
	}

}
