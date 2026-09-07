package com.tnsif.collectiomframework;

import java.util.ArrayList;

public class ArraylistDemo {
public static void main(String[] args) {
	//object creation
	
	ArrayList<String> p=new ArrayList<>();
	//add
	
	p.add("Laptop");
	p.add("headphone");
	p.add(null);
	p.add("Mobile");
	p.add("headphone");
	p.add("headphone");
	p.add("headphone");
	p.add("headphone");
	p.add("headphone");
	p.add("headphone");

	
	System.out.println(p);
	
	System.out.println("product 1:"+p.get(1));
	
	System.out.println("contains mobile ?"+p.contains("Mobile"));
	
	//no of elements
	System.out.println(p.size());
	
	p.remove("headphone");
	
	System.out.println(p);
	
	for(String i:p) {
		System.out.println(i);
	}
	
}
}