package com.vm.training.java.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Example {
public static void main(String[]args) {
	ArrayList<String> javabatch=new ArrayList<String>();
	javabatch.add("ravi");
	javabatch.add("john");
	javabatch.add("anil");
	javabatch.add("kumar");
	

	javabatch.removeAll(javabatch);
	javabatch.addAll(javabatch);
	System.out.println(javabatch);
	
	ArrayList<String> sqlbatch=new ArrayList<String>();
	sqlbatch.add("sourab");
	sqlbatch.add("anikita");
	sqlbatch.add("john");
	sqlbatch.add("kumar");
	sqlbatch.add("manoj");
	
	
	
	Collections.sort(sqlbatch);
	System.out.println(sqlbatch);
}
}
