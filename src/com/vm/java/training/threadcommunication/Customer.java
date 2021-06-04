package com.vm.java.training.threadcommunication;

public class Customer {
	int balance =5000;
public int withdraw(int amount) {
	if(balance<amount) {
		System.out.println("waiting u dont have sufficient balance");
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	System.out.println(Thread.currentThread().getName() + " is going to withdraw");
	balance-=amount;
	return balance;

}
synchronized public int deposit(int amount) {
	balance+=amount;
	System.out.println(Thread.currentThread().getName() +" is deposit");
	notifyAll();
	
	return balance;
	
}
}
