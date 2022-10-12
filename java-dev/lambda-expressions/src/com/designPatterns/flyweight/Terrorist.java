package com.designPatterns.flyweight;

public class Terrorist implements Player{
	
	String weapon;
	
	public Terrorist() {
		System.out.println("Terrorist Object Created");
	}

	@Override
	public void assignWeapon(String weapon) {
		this.weapon=weapon;
	}

	@Override
	public void mission() {
		System.out.println("Terrorist with weapon: "+weapon+" Task: Plant the Bomb");
		
	}

}
