package com.design.singleton;

public class Jalebi {

	private static Jalebi jalebi = new Jalebi();
	
	//eager way of creating singleton
	public static Jalebi getJalebi() {
		return jalebi;
	}
}
