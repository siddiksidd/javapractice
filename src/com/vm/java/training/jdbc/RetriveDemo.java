package com.vm.java.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class RetriveDemo {

	public static void main(String[] args) {
		try {
			//step1
		Class.forName("com.mysql.cj.jdbc.Driver");	
		System.out.println("class is loaded");
		//step2
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/digital?autoReconnect=true&useSSL=false","root","root");
		System.out.println("connected");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from sqlconnection");
		ResultSetMetaData rsd= (ResultSetMetaData) rs.getMetaData();
		System.out.println("-----------------------------------------------------------");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			
		}
		System.out.println("----------------------------------------------------------");
		}
		
		catch (Exception e) {
			
		}
	}

}
