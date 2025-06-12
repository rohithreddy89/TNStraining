package com.tns.kprit.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Executor {

	public static void main(String[] args) {
		CurdOperations.addStudent(501, "Emily");
		CurdOperations.deleteStudent(201);
		CurdOperations.updateEmpName(501, "Zara");
		CurdOperations.showStudent();
		
	}
}

//Connection to mysql database
class DBUtil {
	private static Connection con;
	private static String DRIVERNAME = "org.postgresql.Driver";
	private static String USERNAME = "postgres";
	private static String PASSWORD = "8977";
	private static String URL = "jdbc:postgresql://localhost:5846/TNS";

	public static Connection getConnection() {
		try {
			if (con == null || con.isClosed()) {
				Class.forName(DRIVERNAME);
				System.out.println("Driver Loaded");

				con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				System.out.println("Connection Established");
			}
		} catch (Exception e) {
			System.out.println("Connection error: " + e.getMessage());
		}
		return con;
	}
}


class CurdOperations{
	static Connection con;
	static PreparedStatement pst;
	static {
		try {
			con = DBUtil.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(con!=null) {
			System.out.println("Connection is Success");
	}
	}
	
	//Reading Records from database
	public static void showStudent() {
		try {
			String query = "SELECT * FROM student";
			pst = con.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+ "\t" + rs.getString(2));
			}
			rs.close();
			}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	//Adding student data to table in database
	public static int addStudent(int sid, String sname) {
		int n = 0;
		try {
			pst = con.prepareStatement("INSERT INTO student values(?,?)");
			pst.setInt(1, sid);
			pst.setString(2, sname);
			n = pst.executeUpdate();
			System.out.println("Data Inserted");
		}
		catch (SQLException e){
			System.out.println(e.getMessage());
		}
		return n;
	}
	
	//Deleting Student Record
	public static boolean deleteStudent (int sid) {
		boolean status =  false;
		try {
			String query = "Delete From student WHERE sid="+sid;
			pst=con.prepareStatement(query);
			pst.executeUpdate();
			System.out.println("One Record Deleted Successfully");
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return status;
	}
	
	//Updating Student Record
	public static boolean updateEmpName(int sid, String sname) {
		boolean status = false;
		try {
			String query = "UPDATE student set sname = ? WHERE sid= ?";
			pst = con.prepareStatement(query);
			pst.setString(1, sname);
			pst.setInt(2, sid);
			pst.executeUpdate();
			status = true;
			System.out.println("Updated successfully");
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return status;
	}
}
