package com.tnsif.multithreading;

class Eclipse extends Thread{
	public void run() {
		System.out.println("onenote id: "+""+Thread.currentThread().getId());
		
	}	
}
class Chrome extends Thread{
	public void run() {
		System.out.println("Chrome id:"+""+Thread.currentThread().getId());
	}
	
}
class Onenote extends Thread{
	public void run() {
		System.out.println("Onenote id:"+""+Thread.currentThread().getId());
	}
}




public class ExtendingThread {

	public static void main(String[] args) {
		Eclipse e=new Eclipse();
		e.start();
		
		Chrome c=new Chrome();
		c.start();
		
		Onenote o=new Onenote();
		o.start();
		

	}

}
