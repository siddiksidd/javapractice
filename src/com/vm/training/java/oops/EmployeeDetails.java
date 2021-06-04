package com.vm.training.java.oops;

public class EmployeeDetails extends Employee {
	String mobile;
	String address;
	
	public EmployeeDetails(int empid,String name,String dept,String emailid,String mobile,String address) {
		super(empid,name,dept,emailid);
	    this.mobile = mobile;
		this.address = address;
	}
	 public String toString() {
			return empid+" "+name+" "+dept+" "+emailid+" "+mobile+" "+address;
		}
	
	


	EmployeeDetails(){}

	public static void main(String[]args) {
		EmployeeDetails empDetails=new EmployeeDetails(5774,"sidd","cse","ab@.com","1234567890","zbh");
		System.out.println(empDetails);
	}

}