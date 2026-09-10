package com.tnsif.lambdaexp;
import java.util.Scanner;

@FunctionalInterface
interface Demo2{
	public double electricitybill();
	
}

public class LambdaMethod {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		double units=scanner.nextDouble();
		
		Demo2 demo2= (units)->{
		if(units<=100) {
			return units *3;
		}
		else if(units<200) {
			return units*4;
		}

	};
	System.out.println(demo2.electricitybill());

}
}