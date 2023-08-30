package com.design.iterator;

public class Client {

	public static void main(String[] args) {
		UserManagement userManagement = new UserManagement();
		userManagement.addUser(new User(101,"Karan"));
		userManagement.addUser(new User(102,"Sujeet"));
		userManagement.addUser(new User(103,"Salim"));
		userManagement.addUser(new User(104,"Anil"));
		
		MyIterator myIterator = userManagement.getIterator();
		while(myIterator.hasNext()) {
			User user =(User) myIterator.next();
			System.out.println(user.getName());
		}
	}

}
