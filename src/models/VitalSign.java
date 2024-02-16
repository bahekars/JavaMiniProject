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
    private String bloodPressure;
    private Double temprature;
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

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public Double getTemprature() {
        return temprature;
    }

    public void setTemprature(Double temprature) {
        this.temprature = temprature;
    }

    public Integer getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(Integer respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public VitalSign(Integer vitalsignID, Integer heartRate, String bloodPressure, Double temprature, Integer respiratoryRate) {
        this.vitalsignID = vitalsignID;
        this.heartRate = heartRate;
        this.bloodPressure = bloodPressure;
        this.temprature = temprature;
        this.respiratoryRate = respiratoryRate;
    }

    public VitalSign() {
    }
}
