package com.lambda.example;

import java.util.function.Consumer;

//Find next greater integer from array using Consumer
public class GreaterElement {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] { 5, 8, 6, 25, 35, 7 };
		Consumer<Integer[]> consumer = a -> {
			for (int i = 0; i < a.length; i++) {
				int r = -1;
				for (int j = i + 1; j < a.length; j++) {
					if (a[j] > a[i]) {
						r = a[j];
						break;
					}
				}
				System.out.print(r + " ");
			}

		};
		consumer.accept(arr);
	}
}
