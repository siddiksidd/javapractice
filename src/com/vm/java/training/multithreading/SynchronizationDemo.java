package com.vm.java.training.multithreading;

class Bottle{
	synchronized public void drink(int time) {
		for(int i=1;i<=time;i++)
			System.out.println(Thread.currentThread().getName()+"is drinking "+i);
	
}
}

class DrinkWater implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Bottle bt=new Bottle();
		bt.drink(6);
		}
	
}
public class SynchronizationDemo {

	public static void main(String[] args) {
		
		DrinkWater dw=new DrinkWater();
		
		// TODO Auto-generated method stub
		Thread th=new Thread(dw);
		Thread sidd=new Thread(dw);
		th.setName("thread");
		sidd.setName("siddik");
		th.start();
		sidd.start();
		}

}
