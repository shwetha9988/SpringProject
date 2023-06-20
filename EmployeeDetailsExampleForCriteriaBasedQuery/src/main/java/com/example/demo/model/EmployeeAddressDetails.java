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


@Entity
@Table(name="EmployeeAddressDetails")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeAddressDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@NotNull
	private String street;
	@NotNull
	private String houseNumber;
	@NotNull
	private int zipCode;

	@Override
	public String toString() {
		return "EmployeeAddressDetails [id=" + id + ", street=" + street + ", houseNumber=" + houseNumber + ", zipCode="
				+ zipCode + "]";
	}
	
	

}
