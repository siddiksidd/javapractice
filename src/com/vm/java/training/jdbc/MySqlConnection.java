package com.vm.java.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MySqlConnection {

	public static void main(String[] args) {
		//step-1
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");   //step-1
		System.out.println("driver loaded");
		
		//step-2
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/digital?autoReconnect=true&useSSL=false","root","root");
		System.out.println("connected");
		//step-3
		Statement stmt=con.createStatement();
		//stmt.execute("insert into emp values(5,'sidd','1998-12-03')");//inserting into table//these are static queries
		//stmt.execute("create table sqlconnection(id int,name varchar(20),connection varchar(30))");//creating table
		//stmt.execute("insert into sqlconnection values(2,'rahul','unconnected')");
		stmt.execute("update sqlconnection set connection='connected' where id=4");//updates
		//delete
		System.out.println("updated");
		
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}

}
}
