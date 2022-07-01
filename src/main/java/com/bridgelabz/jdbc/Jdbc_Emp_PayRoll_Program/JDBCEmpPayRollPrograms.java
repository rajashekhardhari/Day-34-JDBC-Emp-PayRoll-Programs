package com.bridgelabz.jdbc.Jdbc_Emp_PayRoll_Program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCEmpPayRollPrograms {

	public static void main(String[] args) throws SQLException {
		Connection connection = null;

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/payrollService", "root", "12345");

			Statement stmt = connection.createStatement();

			stmt.execute("insert into employeePayroll value(11,'Rajesh','200000','1996-01-01','M')");

		} catch (SQLException e) {

			System.out.println("Unable to connect to DB...");
			
			listDrivers();

		} finally {

			connection.close();
		}

	}

	private static void listDrivers() {
		// TODO Auto-generated method stub
		
	}

}
