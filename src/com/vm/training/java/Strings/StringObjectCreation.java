package com.vm.training.java.Strings;

public class StringObjectCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= new String("Value Momentum");
	
		
		String s3= "Value Momentum";
		String s4= "Value Momentum";
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		s1=s1.concat(" Siddik");
		System.out.println(s1);
		System.out.println(s1.length());
		
	}

}
