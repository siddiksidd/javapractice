package com.vm.java.training.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;

public class Storedprocedure {

	public static void main(String[] args) {
		try {
			Connection con=DBConnection.getConnection();
			java.sql.CallableStatement stmt=con.prepareCall("{call findAll()}");
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
			
			}
		
		catch (Exception e) {
			e.printStackTrace();
		}
}
}