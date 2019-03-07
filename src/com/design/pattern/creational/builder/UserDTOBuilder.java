package com.design.pattern.creational.builder;

import java.time.LocalDate;

public interface UserDTOBuilder {
	
	UserDTOBuilder withFirstName(String firstName);
	
	UserDTOBuilder withLastName(String lastName);
	
	UserDTOBuilder withAddress(Address address);
	
	UserDTOBuilder withBirthday(LocalDate birthday);
	
	UserDTO build();
	
	UserDTO getUserDTO();
}
