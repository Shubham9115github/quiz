package com.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class QuestionGet {

	//private Object questions

	public static void main(String[] args, int correct_option) {
		String url = "jdbc:mysql://localhost:3306/quizapplication";
        String username = "root";
        String password = "123";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
            return;
        }
       
       
        String sql = "SELECT question, option_a, option_b, option_c, option_d FROM questions WHERE question_no = ?";
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
        
            statement = connection.prepareStatement(sql);
            statement.setInt(1, 1); 
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                String question = resultSet.getString("question");
                String optionA = resultSet.getString("option_a");
                String optionB = resultSet.getString("option_b");
                String optionC = resultSet.getString("option_c");
                String optionD = resultSet.getString("option_d");

                System.out.println(question);
                System.out.println("A. " + optionA);
                System.out.println("B. " + optionB);
                System.out.println("C. " + optionC);
                System.out.println("D. " + optionD);
                
                Scanner scanner = new Scanner(System.in);
                System.out.print("Your answer: ");
                String userAnswer = scanner.nextLine();
                String[] answers;
				int question_no;
				if (userAnswer.equalsIgnoreCase(answers[question_no]))
                 //   correct_option++;

           //    else {
             //   System.out.println("Question not found.");
             //   }
         
        catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
            }
        
            

      

/*while (questionNum < questions.length) {

    // Display current question number and question
    System.out.println("Question " + (questionNum+1) + ": " + questions[questionNum]);

    // Get user input for answer
    System.out.print("Your answer: ");
    String userAnswer = scanner.nextLine();

    // Compare user answer with correct answer and update results
    if (userAnswer.equalsIgnoreCase(answers[questionNum])) {
      System.out.println("Correct!");
      numCorrect++;
    } else {
      System.out.println("Incorrect. The correct answer was " + answers[questionNum]);
    }

    // Save results to database
    try {
      String sql = "INSERT INTO quiz_results (username, question_number, user_answer, correct_answer) VALUES (?, ?, ?, ?)";
      PreparedStatement pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, username);
      pstmt.setInt(2, questionNum+1);
      pstmt.setString(3, userAnswer);
      pstmt.setString(4, answers[questionNum]);
      pstmt.executeUpdate();
    } catch (SQLException e) {
      System.out.println("Error saving quiz result to database: " + e.getMessage());
    }

    // Move on to next question
    questionNum++;
  }

  // Display final results
  System.out.println("Quiz complete! You got " + numCorrect + " out of " + questions.length + " questions correct.");*/




