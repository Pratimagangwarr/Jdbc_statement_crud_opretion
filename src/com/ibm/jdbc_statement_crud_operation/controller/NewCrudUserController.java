package com.ibm.jdbc_statement_crud_operation.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;

import com.mysql.cj.jdbc.Driver;

public class NewCrudUserController {

	public static void main(String[] args) {
		Connection connection = null;

		// step1:Register the driver class
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			// step2: create connection
			String url = "jdbc:mysql://localhost:3306/jdbc-a5";
			String username = "root";
			String password = "root";
			connection = DriverManager.getConnection(url, username, password);

			// step3: create statement
			Statement statement = connection.createStatement();

//					//step4: execute Query
			// insert
//					String insertUserQuery = "insert into user(id) value(3456)";
//					 int a=statement.executeUpdate(insertUserQuery);
//					 if(a!=0) {
//		            	  System.out.println("Data stored!");
//		              }
//		              else
//		              {
//		            	  System.out.println("Data not stored!");  
//		            	  
//		              }
			// display
//					 String displayUserQuery = "SELECT * FROM user where id=1803";
//					 ResultSet set=statement.executeQuery(displayUserQuery);
//					 set.next();
//					 int id=set.getInt("id");
//					 System.out.println("id=" +id);
			
			
			
			
			//display for single data
//			String displaySingleDataString = "SELECT * FROM user where id=3456";  
//  	ResultSet set=statement.executeQuery(displaySingleData);
//					boolean b=Set.next();
//			if(b) {
//				int id = Set.getInt("id");
//				
//			}
//					//update
//					String update ="update user set dob='1997-12-11' where id=1893";
//	            	int a=statement.executeUpdate(update);
//	            	 
//	            	if(a!=0) {
//	            		System.out.println("data update");
//	            	}
//	            	else
//	            	{
//	            		System.out.println("given user id is wrong or check your code");
//	         
//	}
//	            	 
			// delete
			String delete = "delete from user  where id=23455";
			int a = statement.executeUpdate(delete);

			if (a != 0) {
				System.out.println("data deleted");
			} else {
				System.out.println("given user id is wrong or check your code");

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
