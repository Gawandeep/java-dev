package com.designPatterns.flyweight;

public enum WeaponType {

	AK47("AK-47"),
	M416("M416"),
	SLR("SLR"),
	SKS("SKS"),
	S686("S686");
	
	String value;
	
	WeaponType(String value) {
		this.value=value;
	}
	public String getValue() {
		return value;
	}
}
