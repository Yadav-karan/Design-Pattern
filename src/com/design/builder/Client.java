package com.design.builder;

public class Client {

	public static void main(String[] args) {
		User user = new User.UserBuilder().
				setEmailId("Karan@gmail.com").
				setUserId(101).
				setUserName("Karan").
				build();
		System.out.println(user);
		
		User user2 = User.UserBuilder.builder().
				setUserName("Sujeet").
				setUserId(102).
				setEmailId("Sujeet@gmail.com").
				build();
		System.out.println(user2);
	}
}
