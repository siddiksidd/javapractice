package com.vm.training.java.oops;

public class EmployeePersonalDetails extends EmployeeDetails {
	String nationality;

	public EmployeePersonalDetails(int empid,String name,String dept,String emailid,String mobile,String address,String nationality) {
		super(empid,name,dept,emailid,mobile,address);
		this.nationality = nationality;
	}

	@Override
	public String toString() {
		return "EmployeePersonalDetails [nationality=" + nationality + ", mobile=" + mobile + ", address=" + address
				+ ", empid=" + empid + ", name=" + name + ", emailid=" + emailid + ", dept=" + dept + "]";
	}

public static void main(String[] args)
{
	
EmployeePersonalDetails empd=new EmployeePersonalDetails(5774,"sidd","cse","ab@.com","1234567890","indian","abc");
System.out.println(empd);
}

	


	

}