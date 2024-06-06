/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Date;

/**
 *
 * @author ADMIN
 */
public class User {
    private int Id;
    private String userName;
    private Date DoB;
    private String phone;
    private boolean gender;
    private String address;
    private String email;
    private String password;

    public User(int Id, String userName, Date DoB, String phone, boolean gender, String address, String email, String password) {
        this.Id = Id;
        this.userName = userName;
        this.DoB = DoB;
        this.phone = phone;
        this.gender = gender;
        this.address = address;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getDoB() {
        return DoB;
    }

    public void setDoB(Date DoB) {
        this.DoB = DoB;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "Id=" + Id + ", userName=" + userName + ", DoB=" + DoB + ", phone=" + phone + ", gender=" + gender + ", address=" + address + ", email=" + email + ", password=" + password + '}';
    }

    public User() {
    }
    
    
    
}
