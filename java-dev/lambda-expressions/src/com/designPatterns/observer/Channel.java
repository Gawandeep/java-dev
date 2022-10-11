package com.designPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
	
	private List<Observer> subs=new ArrayList<>();
	private String notification;
	private boolean change;
	private final Object MUTEX=new Object();

	@Override
	public void register(Observer observer) {
		synchronized (MUTEX) {
			if(observer!=null) {
			subs.add(observer);
			}
		}
	}

	@Override
	public void unregister(Observer observer) {
		synchronized (MUTEX) {
		subs.remove(observer);
		}
	}

	@Override
	public void notifyObservers() {
		List<Observer> localObserver;
		synchronized(MUTEX) {
			if(!change) {
				return;
			}
			localObserver=new ArrayList<>(this.subs);
		}
		for(Observer local:localObserver) {
			local.update();
		}
	}

	@Override
	public Object getUpdate() {
		return this.notification;
	}
	
	public void postNotification(String notification) {
		System.out.println("Notification posted");
		this.notification=notification;
		change=true;
		notifyObservers();
	}

}
