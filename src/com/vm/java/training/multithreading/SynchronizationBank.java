package com.vm.java.training.multithreading;
class Account{
	 public void balance(int time) {
	synchronized (this) {
		for(int i=1;i<=time;i++)
			System.out.println(Thread.currentThread().getName()+" is updating");
	
	}
	for(int i=1;i<=time;i++)
		System.out.println(Thread.currentThread().getName()+" can apply for loan ");
}
	
}
class Transaction implements Runnable{
	Account ac=new Account();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		ac.balance(4);
	}
	
}
public class SynchronizationBank {

	public static void main(String[] args) {
		Transaction ts=new Transaction();
		
		Thread deposit=new Thread(ts);
		Thread withdraw=new Thread(ts);
		
		deposit.setName("deposit");
		withdraw.setName("withdraw");
		
		deposit.start();
		withdraw.start();
	}

}
