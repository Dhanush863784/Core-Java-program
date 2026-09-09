package com.tnsif.string;

public class EqualsAndEqualTo {

	public static void main(String[] args) {
		String s1="Dhanush";
		String s2=new String("Shreyas");	
		String s3="Dhanush";
		String s4="Shreyas";
		String s5="Naveen";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s4.equals(s5));
		System.out.println(s4.equalsIgnoreCase(s5));
		
		}

}
