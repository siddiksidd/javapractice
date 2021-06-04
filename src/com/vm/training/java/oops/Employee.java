package com.vm.training.java.oops;

public class Employee {
	int empid=100;
	String name;
	String emailid;
	String dept;
	Employee(){}
	Employee(int x,String empname,String emailid,String empdept){
		empid= x;
		name=empname;
		this.emailid=emailid;
		dept=empdept;	
	}
	public String toString() {
		return empid+" "+name+" "+dept+" "+emailid;
	}
	public static void main(String[] args) {
		Employee emp=new Employee();
		Employee emp1=new Employee(5774, "sidd", "cse","ab@.com");
		System.out.println(emp);
		System.out.println(emp1);
		
		}
}
