package com.vm.training.java.Exceptions;

public class ClassNotFound {
	public static void main(String[]args) {
		try {
			Class.forName("HW");
			System.out.println("found class");
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}
