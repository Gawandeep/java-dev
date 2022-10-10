package com.designPatterns.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Item> items;

	public ShoppingCart() {
		items = new ArrayList<Item>();
	}
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public void removeItem(Item item) {
		items.remove(item);
	}
	
	public int calculateTotal() {
		return items.stream().mapToInt(Item::getPrice).sum();
	}
	
	//Let the user choose payment strategy
	public void pay(PaymentStrategy paymentStrategy) {
		paymentStrategy.pay(calculateTotal());
	}
}
