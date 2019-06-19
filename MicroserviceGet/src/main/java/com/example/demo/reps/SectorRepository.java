package com.example.demo.reps;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Company;
import com.example.demo.models.Sector;;

public interface SectorRepository extends JpaRepository<Sector,Integer>{

	Collection<Sector> findByNameContainingIgnoreCase(String name);
	Collection<Sector> findByCompany(Company c);
}
