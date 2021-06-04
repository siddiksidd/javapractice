package com.vm.java.training.concurrency;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> obj=new ArrayList<Integer>();
		obj.add(1);
		obj.add(4);
		obj.add(3);
		for(Integer val: obj) {
			obj.add(6);
		}
	}

}
