package com.tnsif.streamapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

class Customer{
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Customer(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	private String name;
	private String city;
	
}

public class Test9 {

	public static void main(String[] args) {
		List<Customer>cu=Arrays.asList(new Customer("Dhanush","Noida"));
		new Customer("Naveen","London");
		new Customer("Pavan","Germany");
		new Customer("Jashwanth","America");
		new Customer("Om","London");

		
		
		

	}

}
