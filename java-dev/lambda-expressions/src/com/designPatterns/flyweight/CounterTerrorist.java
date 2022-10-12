package com.designPatterns.flyweight;

public class CounterTerrorist implements Player {
	String weapon;
	
	public CounterTerrorist() {
		System.out.println("CounterTerrorist Object Created");
	}

	@Override
	public void assignWeapon(String weapon) {
		this.weapon=weapon;
	}

	@Override
	public void mission() {
		System.out.println("CounterTerrorist with weapon: "+weapon+" Task: Diffuse the Bomb");
		
	}
	
}
