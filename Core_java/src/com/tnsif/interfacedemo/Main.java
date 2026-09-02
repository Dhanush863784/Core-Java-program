package com.tnsif.interfacedemo;

interface Payment{
	void pay(double amount);
	void checkStatus();
	
}
class UPI implements Payment{

	@Override
	public void pay(double amount) {
	System.out.println("UPI" + amount +"sucessfully done" );
		
	}

	@Override
	public void checkStatus() {
		System.out.println("transction Done");
		
		
	}

}

public class Main {
	public static void main(String[] args) {
		UPI upi=new UPI();
		upi.pay(3500);
		upi.checkStatus();
	
}
}
