package com.User;
import java.sql.Connection;
import java.sql.DriverManager;

       public class ConnectionTest {

	    static Connection Connection = null;
	public static Connection getConnectionDetails() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		   Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/quizapplication","root","123");
		   }catch (Exception e) {
			   e.printStackTrace();
		   }
		return Connection;
	}
	}

