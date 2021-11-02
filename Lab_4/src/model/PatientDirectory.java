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
public class PatientDirectory extends Patient{
    Patient patient;
    private ArrayList<Patient> patientList;
    
public PatientDirectory(){
    this.patientList=new ArrayList<Patient>();
}    
    
public List<Patient> getPatientlist() {
return patientList;
}

public void addPatient(Patient p) {
patientList.add(p);
}
    
public void removePatient(Patient f) {
    f.vitalhist.removeVital();    
    patientList.remove(f);
        
}

public Patient getPatient(int ID) {
       
    for(Patient p:patientList){
        if(p.profile.getUniqueID()==ID){
        return p;
        }
        }
    Patient existingPatient=new Patient(); 
        return existingPatient;
}
 
}
