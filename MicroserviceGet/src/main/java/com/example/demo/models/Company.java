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
//@NamedQuery(name="Company.findAll", query="SELECT c FROM Company c")
@JsonIgnoreProperties({"hibernateLazyInitalizer", "handler"})
//@Table(name = "company")
public class Company implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;

	@NotBlank(message = "Company name can't be blank.")
	@Column
	private String name;

	@Column
	private String description;

	@NotBlank(message = "Company pib can't be blank.")
	@Column
	private Integer pib;

	@NotBlank(message = "Company headquarter can't be blank.")
	@Column
	private String headquarter;

	@OneToMany(mappedBy="company")
	@JsonIgnore
	private List<Sector> sectors;

	public Sector addSector(Sector sector) {
		getSectors().add(sector);
		sector.setCompany(this);

		return sector;
	}

	public Sector removeSector(Sector sector) {
		getSectors().remove(sector);
		sector.setCompany(null);

		return sector;
	}
}
