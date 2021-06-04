package com.vm.training.java.collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemovingDuplicatesArraylistWithLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(1);
		al.add(2);
		System.out.println("Elements in ArrayList: "+al);
		
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>(al);
		System.out.println("linkedhashset: "+lhs);
	}

}
