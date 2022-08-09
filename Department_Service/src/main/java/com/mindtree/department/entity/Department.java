package com.mindtree.department.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String depName;
	
	private int totalNumbersOfEmployees;

	public Department() {
		super();
	}

	public Department(String depName, int totalNumbersOfEmployees) {
		super();
		this.depName = depName;
		this.totalNumbersOfEmployees = totalNumbersOfEmployees;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public int getTotalNumbersOfEmployees() {
		return totalNumbersOfEmployees;
	}

	public void setTotalNumbersOfEmployees(int totalNumbersOfEmployees) {
		this.totalNumbersOfEmployees = totalNumbersOfEmployees;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", depName=" + depName + ", totalNumbersOfEmployees=" + totalNumbersOfEmployees
				+ "]";
	}

	
	
	
	
}
