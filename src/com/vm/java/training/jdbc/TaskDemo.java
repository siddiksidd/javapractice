package com.vm.java.training.jdbc;

import java.sql.ResultSet;
import java.util.Scanner;

public class TaskDemo {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception {


		TDMethods td = new TDMethods();
		boolean flag=true;
		while(flag)
		{
			switch(Menu())
			{
			case "add":
				System.out.print("enter id: ");
				int id = sc.nextInt();
				if(td.validate(id))
				{
					System.out.print("enter name: ");
					String name = sc.next();
					System.out.print("enter salary: ");
					int sal = sc.nextInt();
					System.out.print("enter dept: ");
					String dept = sc.next();
					System.out.println(td.add(id,name,sal,dept));
				}
				else
				{
					System.out.println("ID not valid");
					System.out.print("ReEnter id: ");
					int rid = sc.nextInt();
					System.out.print("enter name: ");
					String rname = sc.next();
					System.out.print("enter salary: ");
					int rsal = sc.nextInt();
					System.out.print("enter dept: ");
					String rdept = sc.next();
					System.out.println(td.add(rid,rname,rsal,rdept));
				}
					
				break;
			case "viewbyid":
				System.out.print("enter Employee Id: ");
				int eid = sc.nextInt();
				ResultSet rs =td.viewbyID(eid);
				while(rs.next())
				{
					System.out.println("Name: "+rs.getString(2));
					System.out.println("Salary: "+rs.getInt(3));
					System.out.println("Department: "+rs.getString(4));
				}
				break;
			case "viewAll":
				ResultSet rs1 =td.viewAll();
				System.out.println("id\tName\tSalary\tDept");
				while(rs1.next())
				{
					System.out.println(rs1.getInt(1)+"\t"+rs1.getString(2)+"\t"+rs1.getInt(3)+"\t"+rs1.getString(4));
				}
				
				break;
				default:
					flag=false;
					break;
			}
		}


	}
	private static String Menu()
	{
		System.out.println("Enter operation to perform:  (add/viewbyid/viewAll)");
		return sc.next();
	}
}