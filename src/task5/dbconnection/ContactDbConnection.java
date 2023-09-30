/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task5.dbconnection;

import java.sql.*;

/**
 *
 * @author Govind Kumar
 */
public class ContactDbConnection {
    
    private void DbConnection(){
        
    }
    
    public static Connection connection = null;
    
    public static Connection getConnection() throws SQLException{
        if(connection == null){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/address_book_system", "root", "root");
                System.out.println("Connection Created Successfully...");
            } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
            }
        }
        return connection;
    }
    
    
}

