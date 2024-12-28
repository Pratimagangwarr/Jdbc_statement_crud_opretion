package com.ibm.jdbc_statement_crud_operation.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateUserController {


	public static void main(String[] args) {
		Connection connection=null;
		
	try {
			
			//step1: load/register driver class from driver software
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
					
					 //Execute Update Query
	            	String update ="update user set dob='1996-09-09' where id=123";
	            	int a=statement.executeUpdate(update);
	            	 
	            	if(a!=0) {
	            		System.out.println("data update");
	            	}
	            	else
	            	{
	            		System.out.println("given user id is wrong or check your code");
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
