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
public class FleetDirectory {
private ArrayList<Fleet> fleetList;
    
public FleetDirectory(){
    this.fleetList=new ArrayList<Fleet>();
}    
    
public List<Fleet> getFleetlist() {
return fleetList;
}

public Fleet addFleet() {
Fleet newFleet = new Fleet();
fleetList.add(newFleet);
return newFleet;
}
    
public void removeFleet(Fleet f) {
        fleetList.remove(f);
}

public Fleet searchSupplier(String fleetName) {
        for (Fleet fleet : fleetList) {
            if (fleet.getSerialNumber().equals(fleetName)) {
                return fleet;
            }
        }
        return null;
    }
}

