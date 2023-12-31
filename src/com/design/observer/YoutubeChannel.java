package com.design.observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject {

	List<Observer> subscribers = new ArrayList<>();

	@Override
	public void subscribe(Observer ob) {
		this.subscribers.add(ob);
	}

	@Override
	public void unSubscribe(Observer ob) {
		this.subscribers.remove(ob);
	}

	@Override
	public void newVideoUploaded(String title) {
		for(Observer ob: subscribers) {
			ob.noified(title);
		}
	}

}
