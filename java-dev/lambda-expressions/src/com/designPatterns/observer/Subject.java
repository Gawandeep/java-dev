package com.designPatterns.observer;

public interface Subject {
	
	void register(Observer observer);
	void unregister(Observer observer);
	void notifyObservers();
	Object getUpdate();
}
