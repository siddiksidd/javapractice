package com.vm.java.training.multithreading;
class parent{
	void phone() {
		System.out.println("Samsung");
	}
}
public class AnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent p1=new parent();
		p1.phone();
		parent p2=new parent()
		{
			void phone() 
			{
				System.out.println("iphone");
			}
		};
		p2.phone();
}
}