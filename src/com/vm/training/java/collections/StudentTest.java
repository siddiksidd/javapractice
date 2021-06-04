package com.vm.training.java.collections;

import java.util.*;
import java.util.HashMap;
import java.util.Scanner;
public class StudentTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n=1;
		while(n!=0)
		{
			int studentId;
			String studentName;
			String studentDepartment;
			String studentAddress;
			System.out.println("Pick the operation to be done: ");
			System.out.println("1. Add Student");
			System.out.println("2. Display Student");
			System.out.println("3. Update Student");
			int option=input.nextInt();
			Student st = new Student();
			st.initialize();
			switch(option)
			{
			case 1:
				System.out.println("Enter ID,Name Department and Address of the student:");
				System.out.println("Id:");
				studentId=input.nextInt();
				System.out.println("Name:");
				studentName=input.next();
				System.out.println("Department:");
				studentDepartment=input.next();
				System.out.println("Address: ");
				studentAddress=input.next();
				st.addStudent(studentId, studentName, studentAddress, studentDepartment);
				break;
			case 2:
				st.displayStudent();
				break;
			case 3:
				System.out.println("Enter department and Address of which id to be updated.");
				System.out.println("Id:");
				studentId=input.nextInt();
				System.out.println("Department: ");
				studentDepartment=input.next();
				System.out.println("Address: ");
				studentAddress=input.next();
				st.updateAddressAndDepartment(studentId, studentAddress, studentDepartment);
				break;
			}
			System.out.println("Want to continue:Enter 1 else enter 0");
			n=input.nextInt();
		}
	}
}