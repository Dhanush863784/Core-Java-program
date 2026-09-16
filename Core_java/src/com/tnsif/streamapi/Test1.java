package com.tnsif.streamapi;
import java .util.Arrays;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		List<Integer> no=Arrays.asList(10,15,20,25,30);
		no.stream().filter(n->n%2==0).forEach(System.out::println);


	}

}
