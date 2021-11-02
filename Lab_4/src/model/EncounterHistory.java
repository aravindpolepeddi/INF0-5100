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
public class EncounterHistory extends Encounter{
    private ArrayList<Encounter> vitalList;
    
    public EncounterHistory(){
    this.vitalList=new ArrayList<Encounter>();
}

    public void setVitalList(ArrayList<Encounter> vitalList) {
        this.vitalList = vitalList;
    }   
    
public List<Encounter> getencounterlist() {
    return vitalList;
}

public void addVital(Encounter e) {
    if(vitalList==null){
    this.vitalList=new ArrayList<Encounter>();
    }
vitalList.add(e);
}

public void removeVital(){
this.vitalList.removeAll(vitalList);
}


}
