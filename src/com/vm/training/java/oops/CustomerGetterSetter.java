package com.vm.training.java.oops;

public class CustomerGetterSetter {
	public static void main(String[]args) {
		Customer cs=new Customer();
		cs.setId(5774);
		cs.setFirstName("Siddik");
		cs.setLastName("Shaik");
		cs.setAccount("savings");
		
		System.out.println(cs.getId());
		System.out.println(cs.getFirstName());
		System.out.println(cs.getLastName());
		System.out.println(cs.getAccount());
	}
	
}
