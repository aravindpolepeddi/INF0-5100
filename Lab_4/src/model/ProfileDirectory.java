/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aravindpolepeddi
 */
public class ProfileDirectory {
    private ArrayList<ProfileClass> profileList;
    
public ProfileDirectory(){
    this.profileList=new ArrayList<ProfileClass>();
}    
    
public List<ProfileClass> getProfilelist() {
return profileList;
}

public void addProfile(ProfileClass p) {
profileList.add(p);
}
    
public void removeProfile(ProfileClass f) {
        profileList.remove(f);
}

/*
public Fleet searchSupplier(String fleetName) {
        for (Fleet fleet : fleetList) {
            if (fleet.getSerialNumber().equals(fleetName)) {
                return fleet;
            }
        }
        return null;
    }
*/
}
