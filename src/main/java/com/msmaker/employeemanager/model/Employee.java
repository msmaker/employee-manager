package com.msmaker.employeemanager.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private Long id;
	private String name;
	private String email;
	private String JobTitle;
	private String phone;
	private String imageUlr;
	@Column(nullable = false, updatable = false)
	private String employeeCode;

	public Employee(Long id, String name, String email, String jobTitle, String phone, String imageUlr,
			String employeeCode) {
		this.id = id;
		this.name = name;
		this.email = email;
		JobTitle = jobTitle;
		this.phone = phone;
		this.imageUlr = imageUlr;
		this.employeeCode = employeeCode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJobTitle() {
		return JobTitle;
	}

	public void setJobTitle(String jobTitle) {
		JobTitle = jobTitle;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getImageUlr() {
		return imageUlr;
	}

	public void setImageUlr(String imageUlr) {
		this.imageUlr = imageUlr;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", JobTitle=" + JobTitle + ", phone="
				+ phone + ", imageUlr=" + imageUlr + ", employeeCode=" + employeeCode + "]";
	}

}
