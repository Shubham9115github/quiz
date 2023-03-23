package com.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class QuizQuestion2 {

	public static void main(String[] args) {
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

			    Scanner input = new Scanner(System.in); 
			    int score = 0; 
			     
			    System.out.println("Welcome to the Quiz Program!"); 
			     String sql = "INSERT INTO questions (question, option_a, option_b, option_c, option_d, correct_option) VALUES (?, ?, ?, ?, ?, ?)";
			        PreparedStatement statement = null;
			    // Question 1 
			    System.out.println("Number of primitive data types in java are ?"); 
			    System.out.println("a. 7"); 
			    System.out.println("b. 8"); 
			    System.out.println("c. 6");
			    System.out.println("d. 9");
			    String answer1 = input.nextLine().toLowerCase(); 
			    if (answer1.equals("b")) { 
			      System.out.println("Correct!"); 
			      score++; 
			    } else { 
			      System.out.println("Sorry, the correct answer is 8."); 
			        }
			    
			    // Question 2
			    System.out.println("What is size of float and double ?"); 
			    System.out.println("a. 32 and 32"); 
			    System.out.println("b. 64 and 64"); 
			    System.out.println("c. 32 and 64");
			    System.out.println("d. 64 and 32");
			    String answer2 = input.nextLine().toLowerCase(); 
			    if (answer2.equals("c")) { 
			      System.out.println("Correct!"); 
			      score++;
			    } else { 
				      System.out.println("Sorry, the correct answer is 32 and 64."); 
				        }
			  
			    // Question 3
			    System.out.println("Select the valid statement."); 
			    System.out.println("a. char[]ch =new char(5)"); 
			    System.out.println("b. char[]ch =new char[5]"); 
			    System.out.println("c. char[]ch =new char()");
			    System.out.println("d. char[]ch =new char[]");
			    String answer3 = input.nextLine().toLowerCase(); 
			    if (answer3.equals("b")) { 
			      System.out.println("Correct!"); 
			      score++; 
			    } else { 
			      System.out.println("Sorry, the correct answer is char[]ch =new char[5]."); 
			        }
			    
			    // Question 4
			    System.out.println("When an array is passed to a method, what does the method receive?"); 
			    System.out.println("a. The reference of the array"); 
			    System.out.println("b. A copy of the array"); 
			    System.out.println("c. Length of the array");
			    System.out.println("d. Copy of first element");
			    String answer4 = input.nextLine().toLowerCase(); 
			    if (answer4.equals("a")) { 
			      System.out.println("Correct!"); 
			      score++; 
			    } else { 
			      System.out.println("Sorry, the correct answer is The reference of the array"); 
			        }
			  
			    // Question 5
			    System.out.println("Select the valid statement to declare and initialize an array."); 
			    System.out.println("a. int[] A = {}"); 
			    System.out.println("b. int[] A = (1,2,3)"); 
			    System.out.println("c. int[] A = ()");
			    System.out.println("d. int[] A = {1,2,3}");
			    String answer5 = input.nextLine().toLowerCase(); 
			    if (answer5.equals("d")) { 
			      System.out.println("Correct!"); 
			      score++; 
			    } else { 
			      System.out.println("Sorry, the correct answer is int[] A = {1,2,3}"); 
			        }
			    
			    // Question 6
			    System.out.println("Arrays in java are-"); 
			    System.out.println("a. Object refrence"); 
			    System.out.println("b. Objects"); 
			    System.out.println("c. Primitive data type");
			    System.out.println("d. None");
			    String answer6 = input.nextLine().toLowerCase(); 
			    if (answer6.equals("b")) { 
			      System.out.println("Correct!"); 
			      score++; 
			    } else { 
			      System.out.println("Sorry, the correct answer is Objects"); 
			        }
			    
			 // Question 7
			    System.out.println("When is the object created with new keyword?"); 
			    System.out.println("a. At run time"); 
			    System.out.println("b. At comple time"); 
			    System.out.println("c. Depends on the code");
			    System.out.println("d. None");
			    String answer7 = input.nextLine().toLowerCase(); 
			    if (answer7.equals("a")) { 
			      System.out.println("Correct!"); 
			      score++; 
			    } else { System.out.println("Sorry, the correct answer is At run time"); 
		        }
			    
				 // Question 8
				    System.out.println("In which of the following is toString() method defined?"); 
				    System.out.println("a. java.lang.Object"); 
				    System.out.println("b. java.lang.String"); 
				    System.out.println("c. java.lang.util");
				    System.out.println("d. None");
				    String answer8 = input.nextLine().toLowerCase(); 
				    if (answer8.equals("a")) { 
				      System.out.println("Correct!"); 
				      score++; 
				    } else { 
				      System.out.println("Sorry, the correct answer is java.lang.Object"); 
				        }
				    
				    // Question 9
				    System.out.println("compareTo() returns"); 
				    System.out.println("a. True"); 
				    System.out.println("b. An int value"); 
				    System.out.println("c. False");
				    System.out.println("d. None");
				    String answer9 = input.nextLine().toLowerCase(); 
				    if (answer9.equals("b")) { 
				      System.out.println("Correct!"); 
				      score++; 
				    } else { 
				      System.out.println("Sorry, the correct answer is An int value"); 
				        }
				    
				 // Question 10
				    System.out.println("Identify the return type of a method that does not return any value."); 
				    System.out.println("a. int"); 
				    System.out.println("b. double"); 
				    System.out.println("c. void");
				    System.out.println("d. None");
				    String answer10 = input.nextLine().toLowerCase(); 
				    if (answer10.equals("c")) { 
				      System.out.println("Correct!"); 
				      score++; 
				    } else { 
				      System.out.println("Sorry, the correct answer is void"); 
				        }
				    System.out.println("Your final score is: " + score);
				  }
	}


