package com.design.observer;

public class Client {

	public static void main(String[] args) {
		YoutubeChannel channel = new YoutubeChannel();
		Subscriber karan = new Subscriber("Karan");
		Subscriber sujeet = new Subscriber("Sujeet");
		channel.subscribe(karan);
		channel.subscribe(sujeet);
		channel.unSubscribe(sujeet);
		channel.newVideoUploaded("Design Pattern");
		
	}

}
