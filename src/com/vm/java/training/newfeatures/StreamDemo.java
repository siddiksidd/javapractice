package com.vm.java.training.newfeatures;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class StreamDemo {
public static void main(String[] args) {
	//List<Integer>l= Arrays.asList(2,3,4,5,6,8,7,9);
	ArrayList<Integer> nums=new ArrayList<Integer>();
	nums.add(2);
	nums.add(3);
	nums.add(4);
	nums.add(5);
	nums.add(6);
	nums.add(8);
	nums.add(7);
	nums.add(9);
	System.out.println("Numbers:"+nums);
	
	//nums.forEach(s->System.out.println(s));  prints line by line
	//nums.forEach(System.out::print);  prints side by side
 	
	long count =nums.stream().count();
	System.out.println("total elements present in stream:"+count); //counts the nos and gives total
	
	nums.stream().filter(s->s>2).forEach(s->System.out.println(s));// prints greater than 2 numbers
	
	nums.stream().map(s->s+100).forEach(s->System.out.println(s)); // adding 100 to every number using map
	
	
	
}
}
