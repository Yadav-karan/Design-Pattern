package com.design.singleton;

public class Client {

	public static void main(String[] args) {

		Samosa samosa = Samosa.getSamosa();
		Samosa samosa1 = Samosa.getSamosa();
		System.out.println(samosa.equals(samosa1));
		
		
		Jalebi jalebi = Jalebi.getJalebi();
		Jalebi jalebi1 = Jalebi.getJalebi();
		System.out.println(jalebi.equals(jalebi1));

		
		Laddo laddo = Laddo.getLaddo();
		Laddo laddo2 = Laddo.getLaddo();
		System.out.println(laddo.equals(laddo2));
	}
}
