package com.design.abstractfactory;

public class Client {

	public static void main(String[] args) {
		Employee employee = EmployeeFactory.getEmployee(new AndroidDevFactory());
		System.out.println(employee.name());
		System.out.println(employee.salary());
	}
}
