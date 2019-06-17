package com.example.demo.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@NamedQuery(name="Sector.findAll", query="SELECT s FROM Sector s")
@JsonIgnoreProperties({"hibernateLazyInitalizer", "handler"})
@Table(name = "sector")
public class Sector implements Serializable{

	private static final long serialVersionUID = 1L;

	@SequenceGenerator(name="SECTOR_ID_GENERATOR", sequenceName="SECTOR_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SECTOR_ID_GENERATOR")
	@Id
	protected Long id;
	
	@Column
	@NotBlank(message = "Sector name can't be blank.")
	private String name;

	@Column
	@NotBlank(message = "Sector tag can't be blank.")
	private String tag;

	//bi-directional many-to-one association to Employee
	@OneToMany(mappedBy="sector")
	@JsonIgnore
	private List<Employee> employees;

	//bi-directional many-to-one association to Company
	@ManyToOne
	@JoinColumn(name="company")
	private Company company;
	
	public Employee addEmployee(Employee employee) {
		getEmployees().add(employee);
		employee.setSector(this);

		return employee;
	}

	public Employee removeEmployee(Employee employee) {
		getEmployees().remove(employee);
		employee.setSector(null);

		return employee;
}
}
