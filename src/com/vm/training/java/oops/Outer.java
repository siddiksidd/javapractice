package com.vm.training.java.oops;

public class Outer {
int i=100;
void show() {
	System.out.println(i);
}
class Inner {
	int a=200;
	void display() {
		show();
		System.out.println(a+" "+i);
	}
}
}
