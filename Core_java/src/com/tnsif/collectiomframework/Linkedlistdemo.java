package com.tnsif.collectiomframework;

import java.util.LinkedList;

public class Linkedlistdemo {
public static void main(String[] args) {
	
	LinkedList<String> h=new LinkedList<>();
	
	h.add("google");
	shwgew
	h.add("youtube");
	h.add("github");
	h.add("python");
	h.add("java");
	
	System.out.println(h);
	
	h.addFirst("Sql");
	System.out.println(h);
	
	h.addLast("postgresql");
	
	
	
	System.out.println("First "+h.peekFirst());
	
	//remove first
	
	System.out.println("removed :"+h.pollFirst());
	System.out.println(h);
}
}