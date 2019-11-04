package com.siva.springboot.report.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siva.springboot.report.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
