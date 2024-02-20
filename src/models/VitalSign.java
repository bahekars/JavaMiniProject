/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author sid
 */
public class VitalSign {
    private Integer vitalsignID;
    private Integer heartRate;
    private Integer bloodPressure;
    private Integer temprature;
    private Integer respiratoryRate;

    public Integer getVitalsignID() {
        return vitalsignID;
    }

    public void setVitalsignID(Integer vitalsignID) {
        this.vitalsignID = vitalsignID;
    }

    public Integer getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(Integer heartRate) {
        this.heartRate = heartRate;
    }

    public Integer getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(Integer bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public Integer getTemprature() {
        return temprature;
    }

    public void setTemprature(Integer temprature) {
        this.temprature = temprature;
    }

    public Integer getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(Integer respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public VitalSign(Integer vitalsignID, Integer heartRate, Integer bloodPressure, Integer temprature, Integer respiratoryRate) {
        this.vitalsignID = vitalsignID;
        this.heartRate = heartRate;
        this.bloodPressure = bloodPressure;
        this.temprature = temprature;
        this.respiratoryRate = respiratoryRate;
    }

    public VitalSign() {
    }
}
