package com.example.demo.reps;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Company;

public interface CompanyRepository extends JpaRepository<Company, Long>{

	Collection<Company> findByNameContainingIgnoreCase(String name);
}
