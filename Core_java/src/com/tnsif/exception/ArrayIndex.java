package com.tnsif.exception;

public class ArrayIndex {
public static void main(String[] args) {
	int marks[]= {80,75,69,34};
	try {
		System.out.println(marks[2]);
		System.out.println(marks[5]);
		System.out.println(marks[1]);
	}
	catch(ArrayIndexOutOfBoundsException r) {
		System.out.println(r);
	}
	System.out.println("program continuee...........");
}

}