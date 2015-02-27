package org.spring.model;

import java.io.Serializable;

public class EmployeeAddress implements Serializable {

	private static final long serialVersionUID = -8732468794323110153L;

	private String city;
	private String post;
	private long pinCode;
	private String state;


	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public long getPinCode() {
		return pinCode;
	}
	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}




}
