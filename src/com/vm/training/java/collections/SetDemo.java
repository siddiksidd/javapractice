package com.vm.training.java.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet();
		hs.add("siddik");
		hs.add("ravi");
		hs.add("siddik");
		hs.add("siddik");
		System.out.println("HashSet:"+hs);
		
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("Hello");
		lhs.add("welcome");
		lhs.add("to");
		lhs.add("java");
		System.out.println("LinkedHashSet:"+ lhs);
		
	}


}
