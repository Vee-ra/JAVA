package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//ResultSet rs = stmnt.executeQuery("select *from employee where EmpID >5 order by EmpID");
//while(rs.next()) {
//	System.out.println(rs.getString("EmpID") +"," + rs.getString("FIrstName") + 
//			"," + rs.getString("LastName") + ","+ rs.getString("EmpZone"));
//}

public class MyFirstJDBC {

	public static void main(String[] args) {
		
		//saveEmployee(9);
		showEmployee("Dhoni"); //for name --> name = '"name"' "
		//to inject all data back from DB without knowing anything -->("XYZ' OR 1=1 -- ' ")
		//showEmployee("XYZ' OR 1=1 -- ' ");
	}
				   static void saveEmployee(Integer EmpID) { //C -create,inserted
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						String url = "jdbc:mysql://localhost:3306/veeradb";
						Connection con = DriverManager.getConnection(url,"root","vsvel.tsi76@outlook.com");
						Statement stmnt = con.createStatement();
							
							boolean inserted = stmnt.execute("INSERT INTO employee(EmpID,FirstName,LastName,EmpAGE,EmpZone) \r \n" 
									+ "VALUES ('"+EmpID+"','Dhoni','Ten',12,'North')"); //AI
							
							if(stmnt.getUpdateCount() > 0) {
								System.out.println("Data insert successful");
							}else {
								System.out.println("Data insert failed");
							}
					con.close();
					
					} catch (ClassNotFoundException e) {e.printStackTrace();}
					catch (SQLException e) {e.printStackTrace();}
				   
		   }
				   static void showEmployee(String FirstName) {  //R-retrieve
						
						try {
							Class.forName("com.mysql.cj.jdbc.Driver");
							String url = "jdbc:mysql://localhost:3306/veeradb";
							Connection con = DriverManager.getConnection(url,"root","vsvel.tsi76@outlook.com");
							//Statement stmnt = con.createStatement();
					        //ResultSet rs = stmnt.executeQuery("select *from employee where EmpID =" + EmpID);
							//ResultSet rs = stmnt.executeQuery("select *from employee where FirstName = '"+FirstName+"'");
							
							PreparedStatement stmnt = con.prepareStatement("select *from employee where FirstName = ?");
							//protected from sql injection attacks --> "'OR 1=1 --' "
							stmnt.setString(1, FirstName);
							ResultSet rs = stmnt.executeQuery();

								
							while(rs.next()) {
									System.out.println(rs.getString("EmpID") +"," + rs.getString("FIrstName") + "," 
							        + rs.getString("LastName") + ","+ rs.getString("EmpZone"));
								}
						con.close();
			} 
						catch (ClassNotFoundException e) {e.printStackTrace();}
							catch (SQLException e) { e.printStackTrace();}
	 						
			}
				   static void updateEmployee() { //U - update
						
						try {
							Class.forName("com.mysql.cj.jdbc.Driver");
							String url = "jdbc:mysql://localhost:3306/veeradb";
							Connection con = DriverManager.getConnection(url,"root","vsvel.tsi76@outlook.com");
							Statement stmnt = con.createStatement();
								
								boolean inserted = stmnt.execute(" UPDATE employee\r\n"
										+ "SET\r\n"
										+ "FirstName = 'veera',\r\n"
										+ "LastName = 'sakthivel',\r\n"
										+ "EmpAGE = '27',\r\n"
										+ "EmpZONE = 'south'\r\n"
										+ "WHERE EmpID = 13"); //After Update
								
								if(stmnt.getUpdateCount() > 0) {
									System.out.println("Data update Successfull");
								}else {
									System.out.println("Data update failed");
								}
						con.close();
						
						} catch (ClassNotFoundException e) { e.printStackTrace();}
						catch (SQLException e) { e.printStackTrace();}
			}
					
				static void deleteEmployee(Integer EmpID) { //D -delete
					
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						String url = "jdbc:mysql://localhost:3306/veeradb";
						Connection con = DriverManager.getConnection(url,"root","vsvel.tsi76@outlook.com");
						Statement stmnt = con.createStatement();
							
							boolean inserted = stmnt.execute("DELETE from employee\r\n "
									+ "where EmpID = '"+EmpID+"'");  //After delete
							//System.out.println("updated ->" + stmnt.getUpdateCount());
							
							if(stmnt.getUpdateCount() > 0) {
								System.out.println("Data delete Successfull");
							}else {
								System.out.println("Data delete failed");
							}
					con.close();
					
					} catch (ClassNotFoundException e) {e.printStackTrace();}
					catch (SQLException e) {e.printStackTrace();}
				
		}
				
}

