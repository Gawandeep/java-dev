package com.lambda.example;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// Find the frequency of each character of String
public class Frequency {

	public static void main(String[] args) {
		String s1 = "gawandeep";
		
		List<Character> l=s1.chars().mapToObj(ch-> (char)ch).collect(Collectors.toList());
		l.stream().map(ch->ch.toString()+Collections.frequency(l,ch)).distinct().forEach(System.out::print);
	}

}
