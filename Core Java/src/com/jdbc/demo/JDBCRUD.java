package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCRUD {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/xyz_company";
		String user="root";
		String pass="pra@118man#15";
		String query="INSERT INTO phone(id,brand,price) VALUES (1001,'Lava',3000)";
		String query1="INSERT INTO phone(id,brand,price)VALUES (1002,'Carbon',4000)";	
		String query2="INSERT INTO phone(id,brand,price)VALUES (1003,'Oppo',5000)";	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection(url, user, pass);
		Statement pst =con.createStatement();
		pst.addBatch(query);
		pst.addBatch(query1);
		pst.addBatch(query2);
		pst.executeBatch();
		System.out.println("Data Added Successfully");
	}

}
