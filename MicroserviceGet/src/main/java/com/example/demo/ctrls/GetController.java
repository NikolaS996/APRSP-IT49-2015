package com.example.demo.ctrls;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
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

	@GetMapping("education")
	@ApiOperation(value = "Returns collection containing all educations from the database")
	public Collection<Education> getEducation(){
		return educationRepository.findAll();
	}

	@GetMapping("educationId/{id}")
	@ApiOperation(value = "Returns the education from the DB whose ID is passed as the path value")
	public Education getEducation(@PathVariable ("id") Long id){
		return educationRepository.getOne(id);
	}

	@GetMapping("educationName/{name}")
	@ApiOperation(value = "Returns collection containint all educations from the database whose name contains the string that's passed as path value")
	public Collection<Education> getEducationByName(@PathVariable ("name") String name){
		return educationRepository.findByNameContainingIgnoreCase(name);
	}

	@GetMapping("educationLevelOfEducation/{levelOfEducation}")
	@ApiOperation(value = "Returns collection containint all educations from the database whose level of education contains the string that's passed as path valu")
	public Collection<Education> getEducationByLevelOfEducationContainingIgnoreCase(@PathVariable ("levelOfEducation") String levelOfEducation){
		return educationRepository.findByLevelOfEducationContainingIgnoreCase(levelOfEducation);
	}

	@GetMapping("company")
	public Collection<Company> getCompany(){
		return companyRepository.findAll();
}
	
	@GetMapping("companyId/{id}")
	public Company getCompany(@PathVariable ("id") Long id){
		return companyRepository.getOne(id);
}
	
	@GetMapping("companyName/{name}")
	public Collection<Company> getCompanyByName(@PathVariable ("name") String name){
		return companyRepository.findByNameContainingIgnoreCase(name);
}
	
	@GetMapping("employee")
	public Collection<Employee> getEmployee(){
		return employeeRepository.findAll();
	}
	@GetMapping("employeeId/{id}")
	public Employee getEmployee(@PathVariable ("id") Long id){
		return employeeRepository.getOne(id);
	}
	@GetMapping("employeeName/{name}")
	public Collection<Employee> getEmployeeByName(@PathVariable ("name") String name){
		return employeeRepository.findByNameContainingIgnoreCase(name);
}
	
	@GetMapping("sector")
	public Collection<Sector> getSector(){
		return sectorRepository.findAll();
	}
	@GetMapping("sectorId/{id}")
	public Sector getSektor(@PathVariable ("id") Long id){
		return sectorRepository.getOne(id);
	}
	@GetMapping("sectorName/{name}")
	public Collection<Sector> getSectorByName(@PathVariable ("name") String name){
		return sectorRepository.findByNameContainingIgnoreCase(name);
	}
	@GetMapping("sectorForCompanyId/{id}")
	public Collection<Sector> sectorForCompanyId(@PathVariable("id") Long id){
		Company c = companyRepository.getOne(id);
		return sectorRepository.findByCompany(c);
}



}
