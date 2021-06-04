package com.vm.java.training.newfeatures;

import java.awt.List;
import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamSorting {
	java.util.List<Integer> sortList(ArrayList<Integer>list) {
		return  list.stream().sorted().collect(Collectors.toList());
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums=new ArrayList<Integer>();
		nums.add(4);
		nums.add(3);
		nums.add(2);
		nums.add(6);
		nums.add(5);
		nums.add(7);
		
		nums.forEach(System.out::println);
		
		System.out.println("============Sort=============");
		
		nums.stream().sorted().forEach(System.out::println);
		
		StreamSorting sorting=new StreamSorting();
		System.out.println("sorting :"+sorting.sortList(nums));
		System.out.println("");
	
	}

}
