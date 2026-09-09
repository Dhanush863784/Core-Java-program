package com.tnsif.collectiomframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// demo for comparator interface
class Person{
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	void display() {
		System.out.println("Name:"+name +"age :"+age);
	}
}
//sort by name
class NameComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		
		return o1.name.compareTo(o2.name);
	}	
}
//sort by age
class Agecomparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		
		return Integer.compare(o1.age, o2.age);
	}	
}

public class Comparatordemo {
public static void main(String[] args) {
	List<Person> p=new ArrayList<>();
	p.add(new Person("John",30));
	p.add(new Person("Rohan",80));
	p.add(new Person("Guru",20));
	p.add(new Person("Tulsi",50));
	
	//sort by name
	
	Collections.sort(p,new NameComparator());
	System.out.println("sorted by name");
	for(Person s:p) {
		s.display();
	}
	
	//sort by age
	Collections.sort(p,new Agecomparator());
	System.out.println("sorted by name");
	for(Person s:p) {
		s.display();
	}
}
}