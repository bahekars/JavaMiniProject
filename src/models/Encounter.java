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
}
