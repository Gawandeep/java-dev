package com.designPatterns.strategy;

public class UPIStrategy implements PaymentStrategy {

	private String pin;
	
	public UPIStrategy(String pin) {
		this.pin = pin;
	}

	@Override
	public void pay(int amount) {
		System.out.println("Rs. "+amount+" paid using UPI");
		
	}
	
}
