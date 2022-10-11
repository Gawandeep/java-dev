package com.designPatterns.observer;

public class Subscriber implements Observer {
	
	private String name;
	private Subject channel;
	
	public Subscriber(String name) {
		this.name=name;
	}
	
	@Override
	public void update() {
		String message=(String) channel.getUpdate();
		if(message==null) {
			System.out.println(name+" has no Notification");
		}
		System.out.println(name+" notified with message: "+message);
	}

	@Override
	public void setSubject(Subject channel) {
		this.channel=channel;
	}

}
