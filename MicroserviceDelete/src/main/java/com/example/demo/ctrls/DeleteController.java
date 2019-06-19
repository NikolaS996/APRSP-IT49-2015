package com.example.demo.ctrls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.reps.CompanyRepository;
import com.example.demo.reps.EducationRepository;
import com.example.demo.reps.EmployeeRepository;
import com.example.demo.reps.SectorRepository;

import com.example.demo.models.*;

@RestController
public class DeleteController {

	@Autowired
	private CompanyRepository companyRepository;
	@Autowired
	private EducationRepository educationRepository;
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private SectorRepository sectorRepository;
	//@Autowired creates instances for us

	@DeleteMapping("educationId/{id}")
	//@ApiOperation(value = "Brise obrazovanje u bazi podataka ciji je id vrednost prosledjen kao path varijabla")
	public ResponseEntity<Education> deleteEducation(@PathVariable ("id") Integer id){
		if(!educationRepository.existsById(id))
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		educationRepository.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("companyId/{id}")
	public ResponseEntity<Company> deleteCompany(@PathVariable ("id") Integer id){
		if(!companyRepository.existsById(id))
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		companyRepository.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
}
	
	@DeleteMapping("employeeId/{id}")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable ("id") Integer id){
		if(!employeeRepository.existsById(id))
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		employeeRepository.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
}
	
	@DeleteMapping(value = "sectorId/{id}")
	public ResponseEntity<Sector> deleteSector(@PathVariable ("id") Integer id){
		if(!sectorRepository.existsById(id))
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		sectorRepository.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
}


}
