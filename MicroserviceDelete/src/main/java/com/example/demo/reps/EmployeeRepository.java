package com.example.demo.reps;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

	Collection<Employee> findByIdNumber(Integer idNumber);
	Collection<Employee> findByNameContainingIgnoreCase(String name);
}
