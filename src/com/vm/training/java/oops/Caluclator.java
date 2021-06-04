package com.vm.training.java.oops;

public class Caluclator {
	int num1,num2;
	int sum=0;
	Caluclator(int num1,int num2){
		this.num1=num1;
		this.num2=num2;
	}
	int add() {
		sum=num1+num2;
		return sum;
	}
}


