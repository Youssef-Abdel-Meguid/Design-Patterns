package com.design.pattern.builder;

public class Address {
	
	private String houserNumber;
	
	private String street;
	
	private String city;
	
	private String zipcode;
	
	private String state;

	public Address(String houserNumber, String street, String city, String state, String zipcode) {
		this.houserNumber = houserNumber;
		this.street = street;
		this.city = city;
		this.zipcode = zipcode;
		this.state = state;
	}

	public String getHouserNumber() {
		return houserNumber;
	}

	public void setHouserNumber(String houserNumber) {
		this.houserNumber = houserNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [houserNumber=" + houserNumber + ", street=" + street + ", city=" + city + ", zipcode="
				+ zipcode + ", state=" + state + "]";
	}

}
