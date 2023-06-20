package com.example.demo.service;
import java.util.List;
import com.example.demo.model.Employee;

public interface EmployeeService {
 Employee saveEmployee(Employee employee);
 List<Employee> getEmployees();
 List<Employee> findByfirstName(String firstName);
	public void getEmployee();
}
