package com.vm.java.training.multithreading;
class Company extends Thread{
	public void run() {
		for(int i=1;i<5;i++)
			System.out.println(Thread.currentThread().getName());
	}
}
class Employee2 extends Thread{
	public void run() {
		for(int i=1;i<50;i++)
			System.out.println(Thread.currentThread().getName());
	}
}

public class DeamonThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company cmp=new Company();
		Employee2 emp=new Employee2();
		
		cmp.setName("Company");
		emp.setName("Employee");
		
		emp.setDaemon(true);
		
		cmp.start();
		emp.start();
	}

}
