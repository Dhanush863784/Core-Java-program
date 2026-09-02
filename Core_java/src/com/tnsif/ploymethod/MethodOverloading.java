package com.tnsif.ploymethod;
class StudentResult{
	void Calculateresult(int math,int java,int dbms) {
		int total=math+java+dbms;
		System.out.println("total marks :"+ total);
	}
	void calculateresult(int math, int css) {
		int total=math+css;
		System.out.println("total marks :"+total);
		}
	void calculateresult(int totalmarks,double bonus) {
		double finalmarks=totalmarks+bonus;
		System.out.println("final marks"+finalmarks);
		
		
	}
}

public class MethodOverloading {
	  public static void main(String[] args) {
		  StudentResult student = new StudentResult();
		  
	  }
}

	        

		  



