package com.design.iterator;

import java.util.ArrayList;
import java.util.List;

public class UserManagement {

	private List<User> userList = new ArrayList<>();
	
	public void addUser(User user) {
		this.userList.add(user);
	}
	
	public void removeUser(int index) {
		this.userList.remove(index);
	}
	
	public MyIterator getIterator() {
		return new MyIteratorImpl(userList);
	}
}
