/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ADMIN
 */
public class UserDAO {

   
    private final Connection conn;
     public UserDAO(Connection conn) {
        this.conn = conn;
    }
     public boolean userRegister(User user){
         boolean f = false;
         try{
            String query = "insert into [User](userName,email,password) values (?,?,?)";
            PreparedStatement pstmt = this.conn.prepareStatement(query);
            pstmt.setString(1, user.getUserName());
            pstmt.setString(2, user.getEmail());
            pstmt.setString(3, user.getPassword());
            pstmt.executeUpdate();
            f = true;  
         }catch(Exception e){
             e.printStackTrace();
         }
         return f;
     }
       public User login(String email, String password) {
        User us = null;
        try {
            String sql = "select * from [User] where email=? and password=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                us = new User();
                us.setId(rs.getInt(4));
                us.setUserName(rs.getString(1));
               us.setEmail(rs.getString(2));
               us.setPassword(rs.getString(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return us;
    }
}
