package com.User;
import java.sql.*;
import java.util.Scanner;

public class QuizResult {
		 
		   static final String USER = "username";
		    static final String PASS = "password";
		    public static void main(String[] args) throws NullPointerException,SQLException {
	       Connection conn = null;
		    PreparedStatement stmt = null;
		     try {
		       	Connection connection = ConnectionTest.getConnectionDetails();
	           	PreparedStatement stmt1 =connection.prepareStatement("insert into studentresult( stdname,stdresult)values(?,?,)");
	            	
		         System.out.println("Connecting to database...");
		      
		           Scanner input = new Scanner(System.in);
		          System.out.print("Enter student name: ");
		          String name = input.next();

		           System.out.print("Enter quiz score: ");
		            int score = input.nextInt();

		             System.out.println("Storing quiz results...");
		            String sql = "INSERT INTO studentresult (stdname, stdresult) VALUES (?, ?)";
		            stmt1 = connection.prepareStatement(sql);
		            stmt1.setString(1, name);
		            stmt1.setInt(2, score);
		            stmt1.executeUpdate();

		            System.out.println("Quiz results stored successfully!");

		        } catch (SQLException se) {
		            
		            se.printStackTrace();
		        } catch (Exception e) {
		            
		            e.printStackTrace();
		        } finally {
		            
		            try {
		                if (stmt != null) stmt.close();
		            } catch (SQLException se2) {
		            } 
		            try {
		                if (conn != null) conn.close();
		            } catch (SQLException se) {
		                se.printStackTrace();
		           }
              } 
	    }
	}

