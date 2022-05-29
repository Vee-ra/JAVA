package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JdbcConnectsDB {

	public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/veeradb","root","");
			PreparedStatement ps = con.prepareStatement("select *from Employee");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
			ResultSetMetaData rsm = rs.getMetaData();
			System.out.println("Column count" + rsm.getColumnCount());
			System.out.println("first field name" + rsm.getColumnClassName(1));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
