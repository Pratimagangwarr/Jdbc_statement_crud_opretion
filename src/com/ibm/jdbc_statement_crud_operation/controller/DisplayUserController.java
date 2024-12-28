package com.ibm.jdbc_statement_crud_operation.controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class DisplayUserController {
	
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
					
				//step4: execute Display query
				String display = "select*from user";
	             ResultSet set =statement.executeQuery(display);
	             
             while(set.next())
            {
		             int id = set.getInt("id");
		             System.out.println("id =" +id);
	             
	            String name =set.getString("name");
		            System.out.println("name=" +name);
		            
//	            String dob =set.getString("dob");
//            System.out.println("dob=" +dob);
//            
		           Date date=set.getDate("dob");
		           LocalDate d = date.toLocalDate();
                   System.out.println(d);
		            
		           
		            
		            
		           String email =set.getString("email");
		            System.out.println("email=" +email);
	            
	                int phone = set.getInt("phone");
	                System.out.println("phone=" +phone);
	             }					
	           	   
					 }catch(ClassNotFoundException | SQLException e )
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




	}}
