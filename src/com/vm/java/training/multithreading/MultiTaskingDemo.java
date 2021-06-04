package com.vm.java.training.multithreading;
class Siddik extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			//System.out.println("Siddik"+i);
			try {
				sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Name="+Thread.currentThread().getName());
		}
	}
}
class Akshay extends Thread{
	public void run() {
		for(int i=11;i<=20;i++)
			//System.out.println("Akshay"+i);
			System.out.println("Name="+Thread.currentThread().getName());
	}
}
class Ravi extends Thread{
	public void run() {
		for(int i=21;i<=30;i++) {
			if(i==25)
				stop();
			//System.out.println("Ravi"+i);
			System.out.println("Name="+Thread.currentThread().getName());
		}
	}
}
public class MultiTaskingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Siddik sidd=new Siddik();
		Akshay ak=new Akshay();
		Ravi rv= new Ravi();
		
		//sidd.run();
		//ak.run();
		//rv.run();
		sidd.setName("Siddik");
		ak.setName("Akshay");
		rv.setName("Ravi");
		
		sidd.start();
		ak.start();
		rv.start();
	}

}
