package com.tnsif.multithreading;

class Account{
	int balance=10000;
	synchronized void deposit(int amount) {
		System.out.println(Thread.currentThread().getName()+" is depositing "+amount);
		
		int currentBalance=balance;
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e);
			
		}
		balance=currentBalance+amount;
		
		System.out.println(Thread.currentThread().getName()+" Completed Balance ="+balance);
	}
}

class DepositTask implements Runnable{

	Account account;
	
	
	DepositTask(Account account){
		this.account=account;
	}
	@Override
	public void run() {
		account.deposit(500);		
	}
}
public class SynnchronizationDemo {
public static void main(String[] args) {
	Account account=new Account();
	DepositTask t=new DepositTask(account);
	
	Thread t1=new Thread(t,"thread-1");
	Thread t2=new Thread(t,"thread-2");
	
	t1.start();
	t2.start();
}
}