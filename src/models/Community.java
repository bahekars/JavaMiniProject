/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author sid
 */
public class Community {
    private Integer communityID;
    private String name;

    public Community() {
    }

    public Community(Integer communityID, String name) {
        this.communityID = communityID;
        this.name = name;
    }

    public Integer getCommunityID() {
        return communityID;
    }

    public String getName() {
        return name;
    }

    public void setCommunityID(Integer communityID) {
        this.communityID = communityID;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
