package com.example.demo.reps;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Education;


public interface EducationRepository extends JpaRepository<Education,Long>{
	Collection<Education> findByLevelOfEducationContainingIgnoreCase(String levelOfEducation);
	Collection<Education> findByNameContainingIgnoreCase(String name);

}
