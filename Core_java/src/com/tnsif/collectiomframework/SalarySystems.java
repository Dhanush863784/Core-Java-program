package com.tnsif.collectiomframework;

import java.util.TreeSet;

public class SalarySystems {

	public static void main(String[] args) {
		TreeSet<Integer>treeSet=new TreeSet<Integer>();
		treeSet.add(10000);
		treeSet.add(20000);
		treeSet.add(30000);
		treeSet.add(40000);
		treeSet.add(50000);
		System.out.println("Salaries :"+treeSet);
		System.out.println("Total Salaries :"+ treeSet.size());
		System.out.println("Contains the salary:"+treeSet.contains(40000));
		System.out.println("Lowest Salary:"+treeSet.first());
		System.out.println("Highest Salary:"+treeSet.last());
		
		System.out.println(treeSet.subSet(3000,30000));
		}

}

