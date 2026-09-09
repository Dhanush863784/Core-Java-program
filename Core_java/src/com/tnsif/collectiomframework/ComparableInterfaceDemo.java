package com.tnsif.collectiomframework;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
	int marks;
	String name;
	public Student(int marks,String name) {
		this.marks = marks;
		this.name = name;
	}
	

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return o.name.compareTo(this.name);
	}
	
	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}
	
}

public class ComparableInterfaceDemo {

	public static void main(String[] args) {
		ArrayList<Student> s= new ArrayList<>();
			s.add(new Student(85,"Dhanush"));
			s.add(new Student(50,"Dhanuh S K"));
			s.add(new Student(60,"Naveen"));
			s.add(new Student(72,"Shreyas"));
			s.add(new Student(82,"Pavan"));
			
			Collections.sort(s);
			System.out.println(s);
			
		

	}

}
