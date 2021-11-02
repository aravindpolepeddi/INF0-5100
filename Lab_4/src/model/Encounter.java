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
public class Encounter extends VitalSign {
   
    VitalSign vitals;

    public VitalSign getVitals() {
        return vitals;
    }

    public void setVitals(VitalSign vitals) {
        this.vitals = vitals;
    }
    
}
