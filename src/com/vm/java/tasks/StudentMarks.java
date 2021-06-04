package com.vm.java.tasks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class StudentMarks {
 static int highestMarks(ArrayList<Integer>arr) {
	 int max=Collections.max(arr);
	 return max;
 }
 static double averageMarks(ArrayList<Integer>arr) {
 int sum=0;
 for(Integer a:arr) {
	 sum+=a;
 }
 return (sum/arr.size());
}
 public static void main(String[] args) {
	
}
}