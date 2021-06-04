package com.vm.training.java.collections;

import java.util.HashMap;

public class Student
{
	HashMap name = new HashMap();
	HashMap address = new HashMap();
	HashMap department = new HashMap();
	void initialize()
	{
		name.put(170031203,"Siddik");
		address.put(170031203, "Guntur");
		department.put(170031203, "D and C");
		
	}
	public void addStudent(int studentId,String studentName,String studentAddress,String studentDepartment)
	{
		name.put(studentId, studentName);
		address.put(studentId, studentAddress);
		department.put(studentId, studentDepartment);
	}
	public void displayStudent()
	{
		System.out.println(name);
		System.out.println(address);
		System.out.println(department);
	}
	public void updateAddressAndDepartment(int studentId,String studentAddress,String studentDepartment )
	{
		if(address.isEmpty()==false)
		{
		address.put(studentId, studentAddress);
		department.put(studentId,studentDepartment);
		}
	}
}