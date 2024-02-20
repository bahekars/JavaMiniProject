/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author sid
 */
public class Admin {
    private Integer adminID;
    private String name;
    private String userName;
    private String password;

    public Admin() {
    }

    public Admin(Integer adminID, String name, String userName, String password) {
        this.adminID = adminID;
        this.name = name;
        this.userName = userName;
        this.password = password;
    }

    public Integer getAdminID() {
        return adminID;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdminID(Integer adminID) {
        this.adminID = adminID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    

}
