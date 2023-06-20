package com.example.demo.model;


import java.util.ArrayList;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="EmployeeMission")
public class EmployeeMission {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@NotNull
	private String name;
	@NotNull
	private int period;
//	@ManyToMany(mappedBy="missions")
//	List<Employee> empl=new ArrayList<>();
	
	@Override
	public String toString() {
		return "EmployeeMission [id=" + id + ", name=" + name + ", period=" + period + "]";
	}
	

}
