package com.design.factory;

public class EmployeeFactory {

	public static Employee getEmployee(String employeeType) {
		if(employeeType.trim().equals("Android Dev")) {
			return new AndroidDev();
		}else if(employeeType.trim().equals("Web Dev")) {
			return new WebDev();
		}else {
			return null;
		}
	}
}
