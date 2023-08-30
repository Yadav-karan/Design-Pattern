package com.design.singleton;

public class Samosa {

	private static Samosa samosa;
	
	private Samosa() {
		
	}
	
	//lazy way
	public static Samosa getSamosa() {
		if(samosa == null) {
			samosa = new Samosa();
		}
		return samosa;
	}
}
