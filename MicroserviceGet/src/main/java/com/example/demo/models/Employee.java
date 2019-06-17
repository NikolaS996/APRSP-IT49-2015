package com.example.demo.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.NamedQuery;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Data
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
@JsonIgnoreProperties({"hibernateLazyInitalizer", "handler"})
@Table(name = "employee")
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	@SequenceGenerator(name="EMPLOYEE_ID_GENERATOR", sequenceName="EMPLOYEE_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EMPLOYEE_ID_GENERATOR")
	@Id
	protected Long id;
	
	@Column
	@NotBlank(message = "Employee ID number can't be blank.")
	private Integer idNumber;

	@Column
	@NotBlank(message = "Employee name can't be blank.")
	private String name;

	@Column
	@NotBlank(message = "Employee surname can't be blank.")
	private String surname;
	
	@ManyToOne
	@JoinColumn(name="education")
	private Education education;

	//bi-directional many-to-one association to Sector
	@ManyToOne
	@JoinColumn(name="sector")
	private Sector sector;
}
