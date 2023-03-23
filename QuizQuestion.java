package com.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import com.mysql.cj.xdevapi.Statement;

public class QuizQuestion {

	public static void main(String[] args) {
		 // Initialize database connection
	    Connection conn = null;
	    java.sql.Statement stmt = null;
	    ResultSet rs = null;
	    try {
	      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quizapplication", "root", "123");
	      stmt =  conn.createStatement();
	    } catch (SQLException e) {
	      System.out.println("Error connecting to database: " + e.getMessage());
	      System.exit(1);
	    }

	    // Initialize variables for user input and quiz results
	    String stdname = null;
	    int stdresult=0;
	    int question_no = 0;
	    int numCorrect = 0;

	    // Get username from user input
	//   Scanner scanner = new Scanner(System.in);
	 //  System.out.print("Enter your username: ");
	 //   stdname = scanner.nextLine();

	    // Retrieve quiz questions from database
	    try {
	      String sql = "SELECT question_no,question, option_a, option_b, option_c, option_d,correct_option FROM questions";
	      rs = ((java.sql.Statement) stmt).executeQuery(sql);
	    } catch (SQLException e) {
	      System.out.println("Error retrieving quiz questions from database: " + e.getMessage());
	      System.exit(1);
	    }

	    // Loop through quiz questions
	    try {
	      while (rs.next()) {

	        // Display current question number and question
	    	  
	        question_no = rs.getInt("question_no");
	        String question = rs.getString("question");
	        String correctAnswer1 = rs.getString("option_a");
	        String correctAnswer2 = rs.getString("option_b");
	        String correctAnswer3 = rs.getString("option_c");
	        String correctAnswer4 = rs.getString("option_d");
	        System.out.println("Question " + question_no + ": " + question +":");
			System.out.println("A. " + correctAnswer1);
            System.out.println("B. " + correctAnswer2);
            System.out.println("C. " + correctAnswer3);
            System.out.println("D. " + correctAnswer4);
            String correctAnswer = rs.getString("correct_option");

	        // Get user input for answer
	        System.out.print("Your answer: ");
	        Scanner scanner = new Scanner(System.in);
			String YourAnswer = scanner.nextLine();

	        // Compare user answer with correct answer and update results
	        if (YourAnswer.equals("A")) {
	          System.out.println("Correct!");
	          numCorrect++;
	        } else {
	          System.out.println("Incorrect. The correct answer was " + "8");
	          
	        }

	        // Save results to database
	        try {
	          String sql2 = "INSERT INTO studentresult (stdname, stdresult) VALUES (?, ?)";
	          PreparedStatement pstmt = conn.prepareStatement(sql2);
	         pstmt.setString(1, stdname);
	          pstmt.setInt(2, stdresult);
	        //  pstmt.setString(3, userAnswer);
	         // pstmt.setString(4, correctAnswer);
	          pstmt.executeUpdate();
	        } catch (SQLException e) {
	          System.out.println("Error saving quiz result to database: " + e.getMessage());
	        }
	      }
	    } catch (SQLException e) {
	      System.out.println("Error reading quiz questions from result set: " + e.getMessage());
	    }

	    // Display final results
	  //  System.out.println("Quiz complete! You got " + numCorrect + " out of " + questionNum + " questions correct.");

	    // Close database connection
	    try {
	      if (rs != null) rs.close();
	      if (stmt != null) ((Connection) stmt).close();
	      if (conn != null) conn.close();
	    } catch (SQLException e) {
	      System.out.println("Error closing database connection: " + e.getMessage());
	    }
	  }

	}

