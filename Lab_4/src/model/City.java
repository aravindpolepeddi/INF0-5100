/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author aravindpolepeddi
 */
public class City extends Community {
    private String city;
    private ProfileDirectory profdir;
    private ArrayList<Patient> patientList;
    private ArrayList<Community> communityList;

    
    public City(){
    this.communityList=new ArrayList<Community>();
    }
    
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ArrayList<Community> getCommunityList() {
        return communityList;
    }    
    

public void addCommunity(Community c) {
communityList.add(c);
}
    
public void removeCommunity(Community f) {
        communityList.remove(f);
}


}
