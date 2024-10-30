package com.bptn.course._27_JDBC_postgressql;

import java.sql.Connection;

public class Main2 {

	public static void main(String[] args) {

		FeedAppClass jdbc = new FeedAppClass();
		Connection conn = jdbc.createConnection();
		// jdbc.addUser(conn, "Ray", "Mist", "raymist", "18292831", "ray@mist.com",
		// "Ray@22", true);
		jdbc.getAllUsers(conn);
		jdbc.closeConnection(conn);
	}

}
