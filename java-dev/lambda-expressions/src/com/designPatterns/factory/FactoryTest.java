package com.designPatterns.factory;

public class FactoryTest {

	public static void main(String[] args) {
		Computer pc=ComputerFactory.getComputer("PC", "8GB","1TB", "2.4 GHz");
		Computer server=ComputerFactory.getComputer("Server", "16GB","1TB", "2.9 GHz");
		
		System.out.println("PC: "+pc);
		System.out.println("Server: "+server);
	}
}
