package com.msmaker.employeemanager.service;

import com.msmaker.employeemanager.repo.EmployeeRepo;

public class EmployeeService {

	private final EmployeeRepo employeeRepo;

	public EmployeeService(EmployeeRepo employeeRepo) {
		this.employeeRepo = employeeRepo;
	}

}
