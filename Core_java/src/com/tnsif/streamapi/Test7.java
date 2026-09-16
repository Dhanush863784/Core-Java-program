package com.tnsif.streamapi;

import java.util.Arrays;
import java.util.List;

public class Test7 {

	public static void main(String[] args) {
		List<Integer> s=Arrays.asList(3000,9000,60000,80000,89749,100000,756251);
		boolean r=s.stream().filter(salary->salary>10000).anyMatch(salary->salary>10000);
		System.out.println("salary found:"+r);
	}

}
