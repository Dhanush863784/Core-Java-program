package com.tnsif.multithreading;

class MyTask extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName()+":"+Thread.currentThread().getId());
	}
	
}
public class PriorityDemo {

	public static void main(String[] args) {
		MyTask t1=new MyTask();
		MyTask t2=new MyTask();
		MyTask t3=new MyTask();
		
		t1.setName("Background Task");
		t2.setName("Normal Task");
		t3.setName("Imp Task");
		
		t1.setPriority(1);
		t1.setPriority(5);
		t1.setPriority(10);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
