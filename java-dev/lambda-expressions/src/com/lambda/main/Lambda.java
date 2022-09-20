package com.lambda.main;


public class Lambda {

	public static void main(String[] args) {
		
		//implement Printable functional interface and define abstract method inside it using lambda expressions
		Printable printable=(p,s)-> p+" Gawandeep "+s;
		
				
		//calling function which take Strings and lambda expression as parameter
		format("Hello","Singh" , printable);
	}
	
	public static void format(String prefix, String suffix, Printable printable) {
		
		// calling getString method of Printable functional interface
		String s=printable.getString(prefix, suffix);
		
		System.out.println(s);
	}
}
