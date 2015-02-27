package org.spring.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;


public class Employee implements Serializable{

	private static final long serialVersionUID = 6711556188812791347L;
	private int id;
    private String name;
    private String organization;
    private String Designation;
    private List<EmployeeAddress> empADD;

    private Date createdDate;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@JsonSerialize(using=DateSerializer.class)
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public List<EmployeeAddress> getEmpADD() {
		return empADD;
	}
	public void setEmpADD(List<EmployeeAddress> empADD) {
		this.empADD = empADD;
	}


}
