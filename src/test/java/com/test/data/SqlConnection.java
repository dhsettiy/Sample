package com.test.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlConnection {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");// read-select update insert-create delete-curd
		Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306", "root", "India@321");
		System.out.println("DB connected");
		Statement statement = connection.createStatement();//query execute
		String query="select sum(customerNumber) from classicmodels.customers;";
		ResultSet rs = statement.executeQuery(query);
		while(rs.next()) {
			System.out.println(rs.getString("sum(customerNumber)"));
		}
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
