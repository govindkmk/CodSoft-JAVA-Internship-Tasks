/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task5.dbmanager;

import task5.dbconnection.ContactDbConnection;
import task5.model.Contact;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Govind Kumar
 */
public class ContactDbManager {
    
    
    private String INSERT_CONTACT_QUERY = "INSERT INTO CONTACT(first_name, last_name, father_name, phone_number, email, address, city, gender) VALUES(?, ?, ?, ?, ?, ?, ?, ?); ";
    private String UPDATE_CONTACT_QUERY = "UPDATE CONTACT SET first_name = ?, last_name = ?, father_name = ?, phone_number = ?, email = ?, address = ?, city = ?, gender = ? WHERE id = ?; ";
    private String DELETE_CONTACT_QUERY = "DELETE FROM CONTACT WHERE id = ?; ";
    private String GET_ALL_CONTACTS_QUERY = "SELECT * FROM CONTACT; ";
    private String GET_CONTACT_QUERY = "SELECT * FROM CONTACT WHERE id = ?; ";
    
    
    public boolean addContact(Contact contact) throws SQLException{
        Connection connection = ContactDbConnection.getConnection();
        boolean success = true;
        
        PreparedStatement prepareStatement = connection.prepareStatement(INSERT_CONTACT_QUERY);
        
        prepareStatement.setString(1, contact.getFirstName());
        prepareStatement.setString(2, contact.getLastName());
        prepareStatement.setString(3, contact.getFatherName());
        prepareStatement.setLong(4, contact.getPhoneNumber());
        prepareStatement.setString(5, contact.getEmail());
        prepareStatement.setString(6, contact.getAddress());
        prepareStatement.setString(7, contact.getCity());
        prepareStatement.setString(8, contact.getGender());
        
        
        prepareStatement.execute();
        
        return success;
    }
    
    
    public boolean updateContact(Contact contact) throws SQLException{
        Connection connection = ContactDbConnection.getConnection();
        boolean success = true;
        
        PreparedStatement prepareStatement = connection.prepareStatement(UPDATE_CONTACT_QUERY);
        
        prepareStatement.setString(1, contact.getFirstName());
        prepareStatement.setString(2, contact.getLastName());
        prepareStatement.setString(3, contact.getFatherName());
        prepareStatement.setLong(4, contact.getPhoneNumber());
        prepareStatement.setString(5, contact.getEmail());
        prepareStatement.setString(6, contact.getAddress());
        prepareStatement.setString(7, contact.getCity());
        prepareStatement.setString(8, contact.getGender());
        prepareStatement.setInt(9, contact.getId());
        
        prepareStatement.execute();
        
        return success;
    }
    
    
    public Contact getContactById(Integer id) throws SQLException{
        
        Connection connection = ContactDbConnection.getConnection();
        
        PreparedStatement prepareStatement = connection.prepareStatement(GET_CONTACT_QUERY);
        prepareStatement.setInt(1, id);

        ResultSet resultSet = prepareStatement.executeQuery();
        
        while(resultSet.next()){
            Contact contact = new Contact();
            contact.setId(resultSet.getInt("id"));
            contact.setFirstName(resultSet.getString("first_name"));
            contact.setLastName(resultSet.getString("last_name"));
            contact.setFatherName(resultSet.getString("father_name"));
            contact.setPhoneNumber(resultSet.getLong("phone_number"));
            contact.setEmail(resultSet.getString("email"));
            contact.setAddress(resultSet.getString("address"));
            contact.setCity(resultSet.getString("city"));
            contact.setGender(resultSet.getString("gender"));
            
            
            return contact;
        }
        
        return null;
    }
    
    public List<Contact> getAllContact() throws SQLException{
        Connection connection = ContactDbConnection.getConnection();
        List<Contact> contacts = new ArrayList<>();
        
        
        
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(GET_ALL_CONTACTS_QUERY);
        
        while(resultSet.next()){
            Contact contact = new Contact();
            contact.setId(resultSet.getInt("id"));
            contact.setFirstName(resultSet.getString("first_name"));
            contact.setLastName(resultSet.getString("last_name"));
            contact.setFatherName(resultSet.getString("father_name"));
            contact.setPhoneNumber(resultSet.getLong("phone_number"));
            contact.setEmail(resultSet.getString("email"));
            contact.setAddress(resultSet.getString("address"));
            contact.setCity(resultSet.getString("city"));
            contact.setGender(resultSet.getString("gender"));
            
            contacts.add(contact);
        }
        
        return contacts;
    }
    
    public boolean deleteContact(Integer id) throws SQLException{
        Connection connection = ContactDbConnection.getConnection();
        boolean success = true;
        
        PreparedStatement prepareStatement = connection.prepareStatement(DELETE_CONTACT_QUERY);
        prepareStatement.setInt(1, id);
        
        
        prepareStatement.executeUpdate();
        
        return success;
    }
}

