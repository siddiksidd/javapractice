package com.vm.java.training.multithreading;

public class ThreadPriorityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Siddik sidd=new Siddik();
		Akshay ak=new Akshay();
		Ravi rv=new Ravi();
		ak.setPriority(1);
		rv.setPriority(8);
		System.out.println(sidd.getPriority());
		
	}

}
