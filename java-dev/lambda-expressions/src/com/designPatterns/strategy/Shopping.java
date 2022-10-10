package com.designPatterns.strategy;

public class Shopping {

	public static void main(String[] args) {
		//sample Data
		Item item1=new Item("1234", 50);
		Item item2=new Item("123454", 120);
		Item item3=new Item("43234", 530);
		ShoppingCart cart=new ShoppingCart();
		cart.addItem(item1);
		cart.addItem(item2);
		cart.addItem(item3);
		cart.pay(new CreditCardStrategy("Raghav", "123454329876", "288", "02/09/2027"));
		cart.pay(new UPIStrategy("123587"));
	}

}
