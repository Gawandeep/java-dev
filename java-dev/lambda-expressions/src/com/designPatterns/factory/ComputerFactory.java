package com.designPatterns.factory;

public class ComputerFactory {
	
	public static Computer getComputer(String type,String Ram, String HDD, String CPU) {
		if(type.equalsIgnoreCase("PC")) {
			return new PC(Ram, HDD, CPU);
		}
		else if(type.equalsIgnoreCase("Server")) {
			return new Server(Ram, HDD, CPU);
		}
		return null;
	}

}
