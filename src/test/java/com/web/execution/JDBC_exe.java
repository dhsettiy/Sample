package com.web.execution;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.test.web.Constant_Query;
import com.test.web.JDBC_Reuse;

public class JDBC_exe {
public static void execution() {
	try {
		ResultSet rs = JDBC_Reuse.execute_read(Constant_Query.sum);
		while(rs.next()) {
			System.out.println(rs.getString("sum(customerNumber)"));
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public static void main(String[] args) {
	execution();
}
}
