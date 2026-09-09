package com.tnsif.string;

public class Stringdemo {

	public static void main(String[] args) {
		String s1="hello";
		System.out.println("Lenfdg"+s1.length());
		System.out.println("charAt method:"+s1.charAt(6));
		System.out.println("convert to uppercase method:"+ s1.toUpperCase());
		System.out.println("convert to lowercase:"+s1.toLowerCase());
		System.out.println("check the word:"+s1.contains("o"));
		System.out.println(s1.startsWith("hi"));
		System.out.println(s1.endsWith("l"));
		System.out.println(s1.replace("hi","hello"));
		System.out.println(s1.substring(4,6));
	}

}
