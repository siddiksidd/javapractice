package com.vm.java.training.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MySqlConnection2 {
public static void main(String[] args) {
	try {
		Connection con=DBConnection.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from sqlconnection");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
	}
	catch (Exception e) {
		// TODO: handle exception
	}
}
}
