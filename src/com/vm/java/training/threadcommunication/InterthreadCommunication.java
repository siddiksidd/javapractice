package com.vm.java.training.threadcommunication;

public class InterthreadCommunication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer=new Customer();
		Thread t1=new Thread() {
			public void run() {
			System.out.println(customer.withdraw(1000));
			}
			};
		Thread t2=new Thread() {
			public void run() {
				System.out.println(customer.deposit(4000));
			}
		};
		t1.setName("withdraw ");
		t2.setName("deposit ");
		
		t1.start();
		t2.start();
	}

}
