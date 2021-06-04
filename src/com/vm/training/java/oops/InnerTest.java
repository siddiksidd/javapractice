package com.vm.training.java.oops;

public class InnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer=new Outer();
		Outer.Inner inner= outer.new Inner();
		inner.display();
	}

}
 