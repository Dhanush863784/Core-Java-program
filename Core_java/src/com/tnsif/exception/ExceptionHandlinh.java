package com.tnsif.exception;

public class ExceptionHandlinh {
public static void main(String[] args) {
	int salary=50000;
	int workingdays=25;
	int bonusDays=5;
	
	try {
		int dailysalary=salary/workingdays;
		System.out.println("Daily salary :"+dailysalary);
		
		int bonusperday=salary/0;
		System.out.println("Bonus :"+(bonusperday*bonusDays));
	}
	catch(ArithmeticException e) {
		System.out.println("cannot calculate salary bonus...");
		System.out.println(e);
	}
	System.out.println("salary processing completed ...");
}
}