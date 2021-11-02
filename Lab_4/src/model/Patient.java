/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aravindpolepeddi
 */
public class Patient extends ProfileClass{
    
    int UniqueID;
    String Name;
    ProfileClass profile;
    EncounterHistory vitalhist;
    
    public Patient(){
    }

    public int getUniqueID() {
        return UniqueID;
    }

    public void setUniqueID(int UniqueID) {
        this.UniqueID = UniqueID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public ProfileClass getProfile() {
        return profile;
    }

    public void setProfile(ProfileClass profile) {
        this.profile = profile;
    }

    public EncounterHistory getVitalhist() {
        return vitalhist;
    }

    public void setVitalhist(EncounterHistory vitalhist) {
        this.vitalhist = vitalhist;
    }
    
}
