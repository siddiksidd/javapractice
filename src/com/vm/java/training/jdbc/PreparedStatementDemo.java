package com.vm.java.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");   //step-1
			System.out.println("driver loaded");
			
			//step-2
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/digital?autoReconnect=true&useSSL=false","root","root");
			System.out.println("connected to digital");
			
			//step3
			Scanner sc=new Scanner(System.in);//user input
			System.out.println("enter id:");
			int id=sc.nextInt();
			System.out.println("enter name:");
			String name=sc.next();
			
			System.out.println("connection:");
			String connection=sc.next();
			
			PreparedStatement ps =  con.prepareStatement("insert into sqlconnection values(?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, connection);
			
			
			ps.executeUpdate();
			System.out.println("inserted");
	}
		catch (Exception e) {
			
		}

}
}
