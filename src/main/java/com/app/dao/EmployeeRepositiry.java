package com.app.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Employee;

public interface EmployeeRepositiry extends JpaRepository<Employee, Integer> {

	Optional<Employee> findByemailId(String email);

}
