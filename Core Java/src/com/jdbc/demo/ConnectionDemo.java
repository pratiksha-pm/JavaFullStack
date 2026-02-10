package com.jdbc.demo;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
public class ConnectionDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//oracle:jdbc:thin:@localhost:1521:xe(if xe);
		String url="jdbc:mysql://localhost:3306/xyz_company";
		String user="root";
		String pass="pra@118man#15";
		//to get data form database
		//String sql="Select * from employee";
		String sql="create table phone(id int primary key,brand varchar(20),price int)";
		//loading the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Successfully");
		
     //Establishing The connection
		Connection con =DriverManager.getConnection(url, user, pass);
		System.out.println("Connection Established Successfully");
		
		//Create Statement
		Statement st =con.createStatement();
		//RESULTSET
		int i=st.executeUpdate(sql);
		System.out.println( i+"row affected");
		//ResultSet rs=st.executeQuery(sql);
		//while (rs.next()) {
		//	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		//}
	}

}
