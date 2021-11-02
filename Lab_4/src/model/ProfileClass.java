/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author aravindpolepeddi
 */
public class ProfileClass {
    
    private String Name;
    private String Community;
    private String Address;
    private String City;
    //private int SeatingCapacity;
    private Boolean isPatient;
    private Date lastUpdated;
    private int uniqueID;

    public int getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(int uniqueID) {
        this.uniqueID = uniqueID;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated() {
        this.lastUpdated = java.util.Calendar.getInstance().getTime();
    }

    public Boolean getIsPatient() {
        return isPatient;
    }

    public void setIsPatient(Boolean isPatient) {
        this.isPatient = isPatient;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCommunity() {
        return Community;
    }

    public void setCommunity(String Community) {
        this.Community = Community;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }
   
    
}
