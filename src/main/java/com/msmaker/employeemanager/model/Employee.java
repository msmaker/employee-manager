package com.msmaker.employeemanager.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private Long id;
	private String name;
	private String email;
	private String JobTitle;
	private String phone;
	private String imageUlr;
	private String employeeCode;
	
}
