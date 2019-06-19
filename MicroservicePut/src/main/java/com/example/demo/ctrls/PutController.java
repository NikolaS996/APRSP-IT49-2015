package com.example.demo.ctrls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.reps.CompanyRepository;
import com.example.demo.reps.EducationRepository;
import com.example.demo.reps.EmployeeRepository;
import com.example.demo.reps.SectorRepository;

import com.example.demo.models.*;

@RestController
public class PutController {

	@Autowired
	private CompanyRepository companyRepository;
	@Autowired
	private EducationRepository educationRepository;
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private SectorRepository sectorRepository;
	//@Autowired creates instances for us

	@PutMapping("education")
	//@ApiOperation(value = "Modifikuje postojece obrazovanje u bazi podataka")
	public ResponseEntity<Education> updateEducation(@RequestBody Education education){
		if(!educationRepository.existsById(education.getId()))
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		educationRepository.save(education);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PutMapping("company")
	//@ApiOperation(value = "Modifikuje postojece preduzece u bazi podataka")
	public ResponseEntity<Company> updateCompany(@RequestBody Company company){
		if(!companyRepository.existsById(company.getId()))
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		companyRepository.save(company);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PutMapping("employee")
	//@ApiOperation(value = "Modifikuje postojeceg radnika u bazi podataka")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
		if(!employeeRepository.existsById(employee.getId()))
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		employeeRepository.save(employee);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	@PutMapping("sector")
	//@ApiOperation(value = "Modifikuje postojeci sektor u bazi podataka")
	public ResponseEntity<Sector> updateSector(@RequestBody Sector sector){
		if(!sectorRepository.existsById(sector.getId()))
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		sectorRepository.save(sector);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
