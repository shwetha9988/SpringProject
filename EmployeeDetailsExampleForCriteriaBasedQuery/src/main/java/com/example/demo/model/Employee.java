package com.example.demo.model;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@NotNull
	private String firstName;
	@NotNull
	private String lastName;
	@Email
	private String email;
	@NotNull
	private String birthDate;
	
	@NotNull
	private String role;
	//@OneToMany(cascade= CascadeType.ALL)
	//@JoinColumn(name="pc_fid",referencedColumnName = "id")
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="pc_fid",referencedColumnName = "id")
	private EmployeeAddressDetails address;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private EmployeeDepartmentDetails department;
	
//	@ManyToMany(fetch=FetchType.EAGER ,cascade=CascadeType.ALL)
//	@JoinTable(name="Employee_mission",
//	           joinColumns= { @JoinColumn(name="Employee_id")},
//	           inverseJoinColumns= {@JoinColumn(name="mission_id")}
//	)
//	private List<EmployeeMission> mission = new ArrayList<>();
//	public long getId() {
//		return id;
//	}
//	public void setId(long id) {
//		this.id = id;
//	}
//	public String getFirstName() {
//		return firstName;
//	}
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//	public String getLastName() {
//		return lastName;
//	}
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public String getBirthDate() {
//		return birthDate;
//	}
//	public void setBirthDate(String birthDate) {
//		this.birthDate = birthDate;
//	}
//	public String getRole() {
//		return role;
//	}
//	public void setRole(String role) {
//		this.role = role;
//	}
//	public Employee() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	
//	public EmployeeAddressDetails getAddress() {
//		return address;
//	}
//	public void setAddress(EmployeeAddressDetails address) {
//		this.address = address;
//	}
//	public EmployeeDepartmentDetails getDepartment() {
//		return department;
//	}
//	public void setDepartment(EmployeeDepartmentDetails department) {
//		this.department = department;
//	}
//	public Employee(String firstName, String lastName, String email, String birthDate, String role,
//			EmployeeAddressDetails address, EmployeeDepartmentDetails department) {
//		super();
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.email = email;
//		this.birthDate = birthDate;																																																											
//		this.role = role;
//		this.address = address;
//		this.department = department;
//	}
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
//				+ ", birthDate=" + birthDate + ", role=" + role + ", address=" + address + ", department=" + department
//				+ "]";
//	}
	
//	public List<EmployeeMission> getMession() {
//		return mission;
//	}
//	public void setMession(List<EmployeeMission> mission) {
//		this.mission = mission;
//	}
	
	
	
	
	

	
}
