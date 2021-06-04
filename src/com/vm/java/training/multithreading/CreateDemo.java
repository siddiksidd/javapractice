package com.vm.java.training.multithreading;
class Employee extends Thread{
	public void run() {
		System.out.println("This is a task of emploee");
	}
}
class Student implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
	System.out.println("this is a task of student");	
	}
	
}
public class CreateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee em=new Employee();
		em.start();
		//em.run();
		
		Student st=new Student();
		Thread th= new Thread();
		
	}

}
