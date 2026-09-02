package com.tnsif.multithreading;

class Sleep extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Sleep id"+""+Thread.currentThread().getId());
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e);
				e.printStackTrace();
			}
		}
		
	}
}
public class SleepThread {

	public static void main(String[] args) {
	Sleep s=new Sleep();
	s.start();
	}

}
