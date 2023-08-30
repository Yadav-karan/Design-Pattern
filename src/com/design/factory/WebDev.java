package com.design.factory;

public class WebDev implements Employee {

	@Override
	public int salary() {
		System.out.println("Fetching Web Developer Salary");
		return 50000;
	}

}
