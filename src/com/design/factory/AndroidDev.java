package com.design.factory;

public class AndroidDev implements Employee {

	@Override
	public int salary() {
		System.out.println("Fetching Android Developer Salary");
		return 40000;
	}

}
