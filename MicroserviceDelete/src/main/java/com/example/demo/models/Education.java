package com.example.demo.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.NamedQuery;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Entity
@Data
//@NamedQuery(name="Education.findAll", query="SELECT e FROM Education e")
@JsonIgnoreProperties({"hibernateLazyInitalizer", "handler"})
public class Education implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name="EDUCATION_ID_GENERATOR", sequenceName="EDUCATION_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EDUCATION_ID_GENERATOR")
	protected int id;
	
	@NotBlank(message = "Education name can't be blank.")
	@Column
	private String name;
	
	@NotBlank(message = "Level of education can't be blank.")
	@Column
	private String levelOfEducation;
	
	@Column
	private String description;
	
	//bi-directional many-to-one association to Employee
	@OneToMany(mappedBy="education")
	@JsonIgnore
	private List<Employee> employees;
	
	public Employee addEmployee(Employee employee) {
		getEmployees().add(employee);
		employee.setEducation(this);

		return employee;
	}

	public Employee removeEmployee(Employee employee) {
		getEmployees().remove(employee);
		employee.setEducation(null);

		return employee;
	}

}