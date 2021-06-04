package com.vm.java.training.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.util.concurrent.Callable;

import com.mysql.cj.jdbc.CallableStatement;

public class InsertEmployeewithProcedureCall {

	public static void main(String[] args) {
		try {
			Connection con=DBConnection.getConnection();
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter id:");
			int id=sc.nextInt();
			System.out.println("enter name:");
			String name=sc.next();
			System.out.println("enter salary:");
			int salary=sc.nextInt();
			System.out.println("enter dept:");
			String dept=sc.next();
			System.out.println("enter age:");
			int age=sc.nextInt();
			java.sql.CallableStatement cstmnt=con.prepareCall("{call insertNewEmployee(?,?,?,?,?)}");
			cstmnt.setInt(1, id);
			cstmnt.setString(2, name);
			cstmnt.setInt(3, salary);
			cstmnt.setString(4, dept);
			cstmnt.setInt(5, age);
			
			cstmnt.execute();
			System.out.println("inserted");
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
