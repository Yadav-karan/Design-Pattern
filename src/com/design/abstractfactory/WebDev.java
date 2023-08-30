package com.design.abstractfactory;

public class WebDev implements Employee {

	@Override
	public int salary() {
		return 40000;
	}

	@Override
	public String name() {
		System.out.println("Hello I'm Web Developer");
		return "WEB DEVELOPER";
	}

}
