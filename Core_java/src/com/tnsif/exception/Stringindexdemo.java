package com.tnsif.exception;

public class Stringindexdemo {
public static void main(String[] args) {
	String name="Java";
	try {
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(3));
		System.out.println(name.charAt(9));
		System.out.println("welcome");
	}
	catch (Exception e) {
		System.out.println(e);
	}
	System.out.println("Program continuee.....");
}
}