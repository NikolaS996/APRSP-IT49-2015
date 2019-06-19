package com.example.demo.ctrls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.reps.CompanyRepository;
import com.example.demo.reps.EducationRepository;
import com.example.demo.reps.EmployeeRepository;
import com.example.demo.reps.SectorRepository;
import com.example.demo.FeignRepository;
import com.example.demo.models.*;

@RestController
public class PostController {
	
	@Autowired
	private CompanyRepository companyRepository;
	@Autowired
	private EducationRepository educationRepository;
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private SectorRepository sectorRepository;
	@Autowired
	private FeignRepository feignRepository;
	//@Autowired creates instances for us


	@PostMapping("education")
	//@ApiOperation(value = "Upisuje obrazovanje u bazi podataka")
	public ResponseEntity<Education> insertEducation(@RequestBody Education education){
		if(!educationRepository.existsById(education.getId())){
			educationRepository.save(education);
			return ResponseEntity.ok(education) ;
		}
		return new ResponseEntity<>(HttpStatus.CONFLICT);
	}

	@PostMapping(value="/company")
	public ResponseEntity<Company> insertCompany(@RequestBody Company company){
		if(!companyRepository.existsById(company.getId())){
			companyRepository.save(company);
			return ResponseEntity.ok(company);
		}
		return new ResponseEntity<>(HttpStatus.CONFLICT);
	}

	@PostMapping(value = "/employee")
	public ResponseEntity<Employee> insertEmployee(@RequestBody Employee employee){
		if(!employeeRepository.existsById(employee.getId())){
			employee.setSequenceNumber(feignRepository.sequenceNumber(employee.getSector().getId()));
			employeeRepository.save(employee);
			return ResponseEntity.ok(employee);
		}
		return new ResponseEntity<>(HttpStatus.CONFLICT);
	}

	@PostMapping("/sector")
	public ResponseEntity<Sector> insertSector(@RequestBody Sector sector){
		if(!sectorRepository.existsById(sector.getId())){
			sectorRepository.save(sector);
			return ResponseEntity.ok(sector);
		}
		return new ResponseEntity<>(HttpStatus.CONFLICT);
	}

}
