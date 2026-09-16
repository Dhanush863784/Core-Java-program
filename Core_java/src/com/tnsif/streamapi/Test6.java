package com.tnsif.streamapi;

import java.util.Arrays;
import java.util.List;

public class Test6 {

	public static void main(String[] args) {
		List<Integer>num =Arrays.asList(24,55,64,25,42,64,82);
		List<Integer>result=(List<Integer>) num.stream().filter(n->n%5==0).toList();
		System.out.println(result);

	}

}
