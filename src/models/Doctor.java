/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author sid
 */
public class Doctor {
    private Integer doctorID;
    private String name;
    private String specialization;
    private String userName;
    private String password;

    public Integer getDoctorID() {
        return doctorID;
    }



    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getUserName() {
        return userName;
    }

    public void setDoctorID(Integer doctorID) {
        this.doctorID = doctorID;
    }

 

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public Doctor() {
    }

    public Doctor(Integer doctorID, String name, String specialization) {
        this.doctorID = doctorID;
        this.name = name;
        this.specialization = specialization;
        
    }
    
    
    
    
}
