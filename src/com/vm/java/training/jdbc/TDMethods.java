
package com.vm.java.training.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TDMethods {
	
	Connection conn;
	public TDMethods() throws Exception
	{
		this.conn = DBConnection.getConnection();
	}	
	public String add(int id,String name,int salary,String dept) throws SQLException
	{
		PreparedStatement ps = conn.prepareStatement("insert into emp1 values(?,?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setInt(3, salary);
		ps.setString(4,dept);
		ps.executeUpdate();
		return "data inserted";
		
	}
	public ResultSet viewAll() throws Exception
	{
		Statement stmt =conn.createStatement();
		return stmt.executeQuery("select * from emp1");
	}
	public ResultSet viewbyID(int id) throws SQLException
	{
		PreparedStatement ps = conn.prepareStatement("select * from emp1 where id=?");
		ps.setInt(1, id);
		return ps.executeQuery();	
	}
	public boolean validate(int id) throws SQLException
	{
		boolean temp =true;;
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select id from emp1");
		while(rs.next())
		{
			if(rs.getInt(1)==id) {
				
		}
			{
				temp=false;
			}	
		}
	stmt.close();
	return temp;		
}
}