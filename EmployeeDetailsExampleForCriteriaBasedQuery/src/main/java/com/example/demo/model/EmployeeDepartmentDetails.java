package com.example.demo.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Builder
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="EmployeeDepartmentDetails")
public class EmployeeDepartmentDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
	@NotNull
	private String departmentName;
	@Override
	public String toString() {
		return "EmployeeDepartmentDetails [id=" + id + ", departmentName=" + departmentName + "]";
	}
	
	
}
