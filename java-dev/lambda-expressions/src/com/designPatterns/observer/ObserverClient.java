package com.designPatterns.observer;

public class ObserverClient {

	public static void main(String[] args) {
		
		Channel channel=new Channel();
		
		Subscriber s1=new Subscriber("Aman");
		Subscriber s2=new Subscriber("Arjun");
		Subscriber s3=new Subscriber("Gagan");
		Subscriber s4=new Subscriber("Raghav");
		
		channel.register(s1);
		channel.register(s2);
		channel.register(s3);
		channel.register(s4);
		
		channel.unregister(s2);
		
		s1.setSubject(channel);
		s2.setSubject(channel);
		s3.setSubject(channel);
		s4.setSubject(channel);
		
		channel.getUpdate();
		
		channel.postNotification("Wecome to Observer Design Pattern");
	}

}
