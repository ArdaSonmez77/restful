package com.tutorialspoint;

import java.io.File; 
import java.io.FileInputStream; 
import java.io.FileNotFoundException;  
import java.io.FileOutputStream; 
import java.io.IOException; 
import java.io.ObjectInputStream; 
import java.io.ObjectOutputStream;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList; 
import java.util.List;

import com.mysql.jdbc.Connection;  

public class UserDao { 
	DbConnection database;
	ArrayList<User> userList;
   public ArrayList<User> getAllUsers() throws Exception{ 
      
       userList = new ArrayList<User>(); 
     
		String sorgu = "SELECT * FROM products";
		 database= new DbConnection();
		Connection connection = (Connection) database.getConnection();
		
		Statement st = connection.createStatement();

		ResultSet rs = st.executeQuery(sorgu);
		while (rs.next())
		{
			User user = new User();
			
			user.setPname(rs.getString("productName"));
			user.setLkey(rs.getString("licenceKey"));
			
			userList.add(user);


		}
				
      return userList; 
   } 
   public User getUserForLicenceKey(String key) throws Exception{
	      List<User> users = getAllUsers();
	      database= new DbConnection();
	      String sorgu = "SELECT yaz lkey e göre";
			Connection connection = (Connection) database.getConnection();
			
			Statement st = connection.createStatement();

			ResultSet rs = st.executeQuery(sorgu);
	      for(User user: users){
	         if(user.getLkey().equals(key)){
	            return user;
	         }
	      }
	      return null;
	   }
   public User getUserForPrdname(String name) throws Exception{
	      List<User> users = getAllUsers();
	      database= new DbConnection();
	      String sorgu = "SELECT yaz pname e göre";
			Connection connection = (Connection) database.getConnection();
			
			Statement st = connection.createStatement();

			ResultSet rs = st.executeQuery(sorgu);
	      for(User user: users){
	         if(user.getLkey().equals(name)){
	            return user;
	         }
	      }
	      return null;
	   }
	/*   public int addUser(User pUser){
	      List<User> userList = getAllUsers();
	      boolean userExists = false;
	      for(User user: userList){
	         if(gt){
	            userExists = true;
	            break;
	         }
	      }		
	      if(!userExists){
	         userList.add(pUser);
	         
	         return 1;
	      }
	      return 0;
	   }
*/
	   public int updateUser(User pUser) throws Exception{
	      List<User> userList = getAllUsers();

	      for(User user: userList){
	        
	      }		
	      return 0;
	   }

	   public int deleteUser(int id) throws Exception{
	      List<User> userList = getAllUsers();

	     
	      return 0;
	   }


}