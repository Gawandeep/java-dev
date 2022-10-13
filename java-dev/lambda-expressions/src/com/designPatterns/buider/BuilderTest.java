package com.designPatterns.buider;

public class BuilderTest {

	public static void main(String[] args) {
		Computer computer=new Computer.ComputerBuilder("8GB","1TB").setBluetoothEnabled(true).setGrapicCardEnabled(true).build();
		System.out.print(computer);

	}

}
