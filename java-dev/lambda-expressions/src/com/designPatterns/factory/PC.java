package com.designPatterns.factory;

public class PC extends Computer {

	private String RAM;
	private String HDD;
	private String CPU;
	
	public PC(String rAM, String hDD, String cPU) {
		System.out.println("PC Object Created");
		RAM = rAM;
		HDD = hDD;
		CPU = cPU;
	}

	@Override
	public String getRAM() {
		return RAM;
	}

	@Override
	public String getHDD() {
		return HDD;
	}

	@Override
	public String getCPU() {
		return CPU;
	}

}
