/*package com.vm.training.java.Exceptions;

import java.util.ArrayList;

 class Employee {
	int empid=100;
	String name;
	String dept;
	Employee(){}
	Employee(int x,String empname,String empdept){
		empid= x;
		name=empname;
		dept=empdept;	
		
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", dept=" + dept + "]";
	}
	class EmployeeDetails extends Employee {
		String PAN;
		String address;
		EmployeeDetails(){}
		EmployeeDetails(String PAN,String address){
			this.PAN = PAN;
			this.address=address;
			
		}
		public String toString() {
			return "EmployeeDetails [PAN=" + PAN + ", address=" + address + "]";
		}
		
	}
	public static class TestGenerics {

		public static void main(String[] args) {
			
			Employee e1=new Employee(100,"siddik","cse");
			ArrayList<Employee> arraylist=new ArrayList<>();
			arraylist.add(e1);
			System.out.println(arraylist);
			EmployeeDetails e2=new EmployeeDetails("pan","adress");
			ArrayList<EmployeeDetails> ar1=new ArrayList<>();
			ar1.add(e2);
			}

	}
}
*/