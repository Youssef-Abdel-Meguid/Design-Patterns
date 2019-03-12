package com.design.pattern.creational.builder;
import java.time.LocalDate;
import java.time.Period;

public class UserDTOWebBuilder implements UserDTOBuilder {

	private String firstName;
	private String lastName;
	private String address;
	private String age;
	private UserDTO userDTO;
	
	@Override
	public UserDTOBuilder withFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	@Override
	public UserDTOBuilder withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	@Override
	public UserDTOBuilder withAddress(Address address) {
		this.address = address.getHouserNumber() + ", " + address.getStreet() + ", " + address.getCity() + ", " + address.getState() + ", " + address.getZipcode();
		return this;
	}

	@Override
	public UserDTOBuilder withBirthday(LocalDate birthday) {
		Period ageInYears = Period.between(birthday, LocalDate.now());
		age = Integer.toString(ageInYears.getYears());

		return this;
	}

	@Override
	public UserDTO build() {
		userDTO = new UserWebDTO(firstName + " " + lastName, address, age);
		return userDTO;
	}

	@Override
	public UserDTO getUserDTO() {
		return userDTO;
	}

	@Override
	public String toString() {
		return "UserDTOWebBuilder [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", age=" + age + ", userDTO=" + userDTO + "]";
	}
}
