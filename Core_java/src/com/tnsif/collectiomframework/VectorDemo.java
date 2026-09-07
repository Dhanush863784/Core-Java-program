package com.tnsif.collectiomframework;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		v.add(1);
		v.add(2);
		v.add(90);
		v.add(90);
		v.add(45);
		v.add(0);
		v.add(90);
		System.out.println(v);
		v.capacity();
		System.out.println(v);
		v.contains(2);
		System.out.println(v);
		v.removeFirst();
		System.out.println(v);
		v.removeFirst();
		System.out.println(v);
		for(int h:v) {
			System.out.println(h);
		}
		
		
		
		
		
	

	}

}
