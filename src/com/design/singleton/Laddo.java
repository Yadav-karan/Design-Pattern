package com.design.singleton;

public class Laddo {

	private static Laddo laddo;
	private Laddo() {
		
	}
	
	public static Laddo getLaddo() {
		if(laddo == null) {
			synchronized(Laddo.class) {
				if(laddo == null) {
					laddo = new Laddo();
				}
			}
		}
		return laddo;
	}
}
