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
public class Encounter {
    private Integer encounterID;
    private LocalDate date;
    private Doctor doctor;
    private VitalSign vitalSign;
    private String diagnosis;

    public LocalDate getDate() {
        return date;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Integer getEncounterID() {
        return encounterID;
    }

    public VitalSign getVitalSign() {
        return vitalSign;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setEncounterID(Integer encounterID) {
        this.encounterID = encounterID;
    }

    public void setVitalSign(VitalSign vitalSign) {
        this.vitalSign = vitalSign;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
