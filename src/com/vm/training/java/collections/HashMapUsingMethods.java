package com.vm.training.java.collections;

import java.util.HashMap;

public class HashMapUsingMethods {
 static HashMap add(HashMap contacts,String name,String mobile) {
		contacts.put(name, mobile);
		return contacts;
	}
 static HashMap remove(HashMap contacts, String name) {
	contacts.remove(name);
	return contacts;
}
public HashMap display(HashMap contacts) {
	System.out.print(contacts);
	return contacts;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap contacts=new HashMap();
	}
	
}
