package com.virtusa.customerapidemo.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class FullName {
	@Column(name="first_name",nullable = false,length = 50)
	private String firstName;
	@Column(name="last_name",nullable = false,length = 50)
	private String lastName;
	@Column(name="middle_name",nullable = false,length = 50)
	private String middleName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
}
