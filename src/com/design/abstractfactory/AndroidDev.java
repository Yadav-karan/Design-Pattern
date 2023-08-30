package com.design.abstractfactory;

public class AndroidDev implements Employee {

	@Override
	public int salary() {
		return 30000;
	}

	@Override
	public String name() {
		System.out.println("Hello I'm Android Developer");
		return "ANDROID DEVELOPER";
	}

}
