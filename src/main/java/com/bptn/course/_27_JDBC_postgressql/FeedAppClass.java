package com.bptn.course._27_JDBC_postgressql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FeedAppClass {

	private static final String userName = "postgres";
	private static final String password = "pg123";
	private static final String dbName = "feedApp";
	private static final String port = "5432";
	private static final String dbUrl = "localhost";

	public Connection createConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:postgresql://" + dbUrl + ":" + port + "/" + dbName, userName,
					password);
		} catch (Exception e) {
			System.out.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);

		}
		System.out.println("Opened database successfully");
		return conn;
	}

	public void addUser(Connection conn, String firstName, String lastName, String userName, String phone,
			String emailId, String password, boolean emailVerified) {

		PreparedStatement stmt = null;
		String sql = "INSERT INTO \"user\" (\"firstName\", \"lastName\", \"userName\", \"phone\", \"emailId\", \"password\", \"emailVerified\", \"createdOn\") "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, CURRENT_TIMESTAMP)";
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, firstName);
			stmt.setString(2, lastName);
			stmt.setString(3, userName);
			stmt.setString(4, phone);
			stmt.setString(5, emailId);
			stmt.setString(6, password);
			stmt.setBoolean(7, emailVerified);

			int resultCount = stmt.executeUpdate();
			System.out.println(resultCount + " record(s) inserted");

		} catch (SQLException ex) {
			// handle exception
			System.out.println("Exception:" + ex.getMessage());
		}
	}

	public void getAllUsers(Connection conn) {

		try {
			PreparedStatement stmt = null;
			String sql = "SELECT * FROM \"user\"";
			stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				System.out.println("User ID: " + rs.getInt("userId"));
				System.out.println("First Name:" + rs.getString("firstName"));
				System.out.println("Last Name:" + rs.getString("lastName"));
				System.out.println("User Name:" + rs.getString("userName"));
				System.out.println("Phone:" + rs.getString("phone"));
				System.out.println("Email:" + rs.getString("emailId"));
				System.out.println("Password:" + rs.getString("password"));
				System.out.println("Verified Email:" + rs.getString("emailVerified"));

			}
			stmt.close();
		} catch (SQLException e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}

	public boolean closeConnection(Connection conn) {
		boolean flag = true;
		try {
			conn.close();
			System.out.println("Database connection closed successfully");
		} catch (SQLException ex) {
			flag = false;
			// handle exception
			System.out.println("Exception:" + ex.getMessage());
		}
		return flag;
	}
}
