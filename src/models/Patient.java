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
    private String dob;
    private String contactNumber;

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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Patient(Integer patientID, String name, String dob, String contactNumber) {
        this.patientID = patientID;
        this.name = name;
        this.dob = dob;
        this.contactNumber = contactNumber;
        
    }

    public Patient() {
    }
}
