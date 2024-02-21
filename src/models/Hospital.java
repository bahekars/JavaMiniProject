/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author sid
 */
public class Hospital {
    private Integer hospitalID;
    private String name;
    private String location;
    private Community community;
    private Doctor doctor;

    public Integer getHospitalID() {
        return hospitalID;
    }

    public void setHospitalID(Integer hospitalID) {
        this.hospitalID = hospitalID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
        
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Hospital(Integer hospitalID, String name, String location, Community community, Doctor doctor) {
        this.hospitalID = hospitalID;
        this.name = name;
        this.location = location;
        this.community = community;
        this.doctor = doctor;
    }
    
    

    public Hospital() {
    }
}
