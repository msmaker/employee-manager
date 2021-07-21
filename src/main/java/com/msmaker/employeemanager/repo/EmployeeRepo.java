package com.msmaker.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.msmaker.employeemanager.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}
