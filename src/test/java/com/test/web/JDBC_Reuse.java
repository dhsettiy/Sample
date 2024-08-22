package com.test.web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Reuse {
public static Connection connection() {
	Connection connection=null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306", "root", "India@321");
		System.out.println("DB Connected");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return connection;
}
//select query
public static ResultSet execute_read(String query) {
	ResultSet executeQuery=null;
	try {
		Statement statement = connection().createStatement();
		 executeQuery = statement.executeQuery(query);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return executeQuery;
}
public static void execute_create(String query) {//create query
	try {
		Statement statement = connection().createStatement();
		boolean execute = statement.execute(query);
		System.out.println(execute);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static void execute_update(String query) {
	try {
		Statement statement = connection().createStatement();
		statement.executeUpdate(query);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
