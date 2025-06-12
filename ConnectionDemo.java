package com.tns.kprit.JDBC;

import java.sql.*;


public class ConnectionDemo {

	private static String DRIVERNAME = "org.postgresql.Driver";
	private static String USERNAME = "postgres";
	private static String PASSWORD = "8977";
	//private static String DBNAME = "TNS";
	private static String URL = "jdbc:postgresql://localhost:5846/TNS";
	public static void main(String[] args) {
		try {
			Class.forName(DRIVERNAME);
			System.out.println("Driver Loaded");
			
			Connection con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("Connection Established");
			
			String query = "Select * from Student";
			Statement stmt = ((java.sql.Connection) con).createStatement();
			
			
			
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.print(rs.getInt(1)+" ");
				System.out.print(rs.getString(2)+" ");
				System.out.print(rs.getString(3));
			}System.out.println();
			
			con.close();
		}
		catch (Exception e){
			System.out.println(e);
		}
	}
}
