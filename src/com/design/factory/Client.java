package com.design.factory;

public class Client {

	public static void main(String[] args) {
		Employee employee = EmployeeFactory.getEmployee("Android Dev");
		System.out.println(employee.salary());
		
		Employee employee2 = EmployeeFactory.getEmployee("Web Dev");
		System.out.println(employee2.salary());
	}
}
