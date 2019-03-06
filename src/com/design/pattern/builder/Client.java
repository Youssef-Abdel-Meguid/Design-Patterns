package com.design.pattern.builder;

import java.time.LocalDate;

public class Client {

	public static void main(String[] args) {
		User user = createUser();
		UserDTO userDTO = directBuilder(new UserDTOWebBuilder(), user);
		System.out.println(userDTO);
	}
	
	private static UserDTO directBuilder(UserDTOBuilder builder, User user) {
		return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName()).withBirthday(user.getBirthday()).withAddress(user.getAddress()).build();
	}
	
	public static User createUser() {
		User user = new User();
		user.setFirstName("ha");
		user.setLastName("ha");
		user.setBirthday(LocalDate.of(1960, 5, 6));
		user.setAddress(new Address("3", "Mahmoud el nawawe", "Ain shams", "Cairo", "6666"));
		return user;
	}

}
