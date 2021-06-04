package com.vm.training.java.collections;

import java.util.ArrayList;

public class UserDefinedCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> emplist=new ArrayList<Employee>();
		emplist.add(new Employee(1,"sidd",45000));
		emplist.add(new Employee(2,"ravi",50000));
		emplist.add(new Employee(3,"akshay",60000));
	}

}
