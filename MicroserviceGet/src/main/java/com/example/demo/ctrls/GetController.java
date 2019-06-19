package com.example.demo.ctrls;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.models.*;
import com.example.demo.reps.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags= {"Read operations for Education, Company, Employee, Sector"})
public class GetController {

	@Autowired
	private CompanyRepository companyRepository;
	@Autowired
	private EducationRepository educationRepository;
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private SectorRepository sectorRepository;
	//@Autowired creates instances for us

	@GetMapping("education")
	@ApiOperation(value = "Returns collection containing all educations from the database")
	public ResponseEntity<Collection<Education>> getEducation(){
		Collection<Education> educations = educationRepository.findAll();
		if(CollectionUtils.isEmpty(educations))
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(educations);
	}

	@GetMapping("educationId/{id}")
	@ApiOperation(value = "Returns the education from the DB whose ID is passed as the path value")
	public ResponseEntity<Education> getEducation(@PathVariable ("id") Integer id){
		if(educationRepository.existsById(id))
			return ResponseEntity.ok(educationRepository.getOne(id));
		return ResponseEntity.notFound().build();
		
	}

	@GetMapping("educationName/{name}")
	@ApiOperation(value = "Returns collection containint all educations from the database whose name contains the string that's passed as path value")
	public ResponseEntity<Collection<Education>> getEducationByName(@PathVariable ("name") String name){
		Collection<Education> educations = educationRepository.findByNameContainingIgnoreCase(name);
		if(CollectionUtils.isEmpty(educations))
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(educations);
	}

	@GetMapping("educationLevelOfEducation/{levelOfEducation}")
	@ApiOperation(value = "Returns collection containint all educations from the database whose level of education contains the string that's passed as path valu")
	public ResponseEntity<Collection<Education>> getEducationByLevelOfEducationContainingIgnoreCase(@PathVariable ("levelOfEducation") String levelOfEducation){
		Collection<Education> educations = educationRepository.findByLevelOfEducationContainingIgnoreCase(levelOfEducation);
		if(CollectionUtils.isEmpty(educations))
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(educations);
	}

	@GetMapping("company")
	public ResponseEntity<Collection<Company>> getCompany(){
		Collection<Company> companies = companyRepository.findAll();
		if(CollectionUtils.isEmpty(companies))
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(companies);
}
	
	@GetMapping("companyId/{id}")
	public ResponseEntity<Company> getCompany(@PathVariable ("id") Integer id){
		if(companyRepository.existsById(id))
			return ResponseEntity.ok(companyRepository.getOne(id));
		return ResponseEntity.notFound().build();
}
	
	@GetMapping("companyName/{name}")
	public ResponseEntity<Collection<Company>> getCompanyByName(@PathVariable ("name") String name){
		Collection<Company> companies = companyRepository.findByNameContainingIgnoreCase(name);
		if(CollectionUtils.isEmpty(companies))
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(companies);
}
	
	@GetMapping("employee")
	public ResponseEntity<Collection<Employee>> getEmployee(){
		Collection<Employee> employees= employeeRepository.findAll();
		if(CollectionUtils.isEmpty(employees))
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(employees);
	}
	@GetMapping("employeeId/{id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable ("id") Integer id){
		if(employeeRepository.existsById(id))
			return ResponseEntity.ok(employeeRepository.getOne(id));
		return ResponseEntity.notFound().build();
	}
	@GetMapping("employeeName/{name}")
	public ResponseEntity<Collection<Employee>> getEmployeeByName(@PathVariable ("name") String name){
		Collection<Employee> employees= employeeRepository.findByNameContainingIgnoreCase(name);
		if(CollectionUtils.isEmpty(employees))
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(employees);
}
	
	@GetMapping("sector")
	public ResponseEntity<Collection<Sector>> getSector(){
		Collection<Sector> sectors= sectorRepository.findAll();
		if(CollectionUtils.isEmpty(sectors))
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(sectors);
	}
	@GetMapping("sectorId/{id}")
	public ResponseEntity<Sector> getSektor(@PathVariable ("id") Integer id){
		if(sectorRepository.existsById(id))
			return ResponseEntity.ok(sectorRepository.getOne(id));
		return ResponseEntity.notFound().build();
	}
	@GetMapping("sectorName/{name}")
	public ResponseEntity<Collection<Sector>> getSectorByName(@PathVariable ("name") String name){
		Collection<Sector> sectors= sectorRepository.findByNameContainingIgnoreCase(name);
		if(CollectionUtils.isEmpty(sectors))
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(sectors);
	}
	@GetMapping("sectorForCompanyId/{id}")
	public ResponseEntity<Collection<Sector>> sectorForCompanyId(@PathVariable("id") Integer id){
		Company c = companyRepository.getOne(id);
		Collection<Sector> sectors= sectorRepository.findByCompany(c);
		if(CollectionUtils.isEmpty(sectors))
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(sectors);
}



}
