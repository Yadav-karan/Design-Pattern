package com.design.prototype;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Creating Object using prototype design pattern");
		NetworkConnection networkConnection = new NetworkConnection();
		networkConnection.setIp("192.168.64.0");
		networkConnection.loadImportantData();
		
		System.out.println(networkConnection);
		
		try {
			NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();
			System.out.println(networkConnection2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}
}
