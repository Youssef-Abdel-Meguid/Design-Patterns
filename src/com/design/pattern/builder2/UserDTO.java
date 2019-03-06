package com.design.pattern.builder2;

import java.time.LocalDate;
import java.time.Period;

import com.design.pattern.builder.Address;

public class UserDTO {
	
	private String name;
	
	private String address;
	
	private String age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "name=" + name + "\naddress=" + address + "\nage=" + age + "";
	}
	
	public static class UserDTOBuilder {
		
		private String firstName;
		private String lastName;
		private String address;		
		private String age;
		private UserDTO userDTO;

		public UserDTOBuilder withFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		
		public UserDTOBuilder withLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		
		public UserDTOBuilder withAddress(Address address) {
			this.address = address.getHouserNumber() + ", " + address.getStreet() + ", " + address.getCity() + ", " + address.getState() + ", " + address.getZipcode();
			return this;
		}
		
		public UserDTOBuilder withBirthday(LocalDate birthday) {
			Period ageInYears = Period.between(birthday, LocalDate.now());
			age = Integer.toString(ageInYears.getYears());
			return this;
		}
		
		public UserDTO build() {
			this.userDTO = new UserDTO();
			this.userDTO.setName(this.firstName + " " + this.lastName);
			this.userDTO.setAge(age);
			this.userDTO.setAddress(address);
			return this.userDTO;
		}
		
		public UserDTO getUserDTO() {
			return this.userDTO;
		}
		
	}
	
	public static UserDTOBuilder getBuilder() {
		return new UserDTOBuilder();
	}

}
