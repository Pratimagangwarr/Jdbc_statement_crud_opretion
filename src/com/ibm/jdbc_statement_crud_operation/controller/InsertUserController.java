package com.ibm.jdbc_statement_crud_operation.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertUserController {
	public static void main(String[] args) {
		Connection connection=null;
		
	try {
			
			//step1: load driver class from driver software
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
					
					//step2: create connection with url, user, password
					String url ="jdbc:mysql://localhost:3306/jdbc-a5";
					String username="root";
					String password="root";
					connection = DriverManager.getConnection(url,username,password);
					
					
					// step3: create statement
					Statement statement = connection.createStatement();
					
					//System.out.println(connection);
					//System.out.println(statement); 
					
					//step4: execute query
					String insertUserQuery = "insert into user(id,name,dob,email,phone) values(1800,'mohan','1997-11-11','ac915p2s@gmail.com',2490617890)";
		             int a=statement.executeUpdate(insertUserQuery);
					//System.out.println(a);
		              if(a!=0) {
		            	  System.out.println("Data stored!");
		              }
		              else
		              {
		            	  System.out.println("Data not stored!");  
		            	  
		              }
							
		}
		catch(ClassNotFoundException | SQLException e )
		{
			e.printStackTrace();    		
		}
		
		finally {
			//step5: Close the connection
			try {
				connection.close();
			} 
			catch (SQLException e)
			{
				
				e.printStackTrace();
			}
			
		}
	}
	
	
}


