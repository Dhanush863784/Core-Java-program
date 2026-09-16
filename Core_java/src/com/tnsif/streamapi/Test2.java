package com.tnsif.streamapi;
import java.util.Arrays;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		List<String>names=Arrays.asList("Dhanush","Chiragh","Varun");
		List<String>uppernames=names.stream().map(name->name.toUpperCase()).toList();
		System.out.println("All converted"+names);
		
	}

}
