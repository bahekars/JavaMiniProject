/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDate;


/**
 *
 * @author sid
 */
public class Patient {
    private Integer patientID;
    private String name;
    private LocalDate dob;
    private String contactNumber;
    private String userName;
    private String password;

    public Patient() {
    }

    public Integer getPatientID() {
        return patientID;
    }

    public void setPatientID(Integer patientID) {
        this.patientID = patientID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Patient(Integer patientID, String name, LocalDate dob, String contactNumber, String userName, String password) {
        this.patientID = patientID;
        this.name = name;
        this.dob = dob;
        this.contactNumber = contactNumber;
        this.userName = userName;
        this.password = password;
    }

}
