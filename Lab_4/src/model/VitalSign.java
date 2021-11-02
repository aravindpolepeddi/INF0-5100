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
public class VitalSign {
    private int weight;
    private int height;
    private int BMI;
    private int age;
    private int bloodPressureSystolic;
    private int bloodPressureDiastolic;
    private int heartRate;
    private int temperature;
    private String bloodoxygen;
    private Date checkupdate;
   

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBMI() {
        return BMI;
    }

    public void setBMI(int BMI) {
        this.BMI = BMI;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBloodPressureSystolic() {
        return bloodPressureSystolic;
    }

    public void setBloodPressureSystolic(int bloodPressureSystolic) {
        this.bloodPressureSystolic = bloodPressureSystolic;
    }

    public int getBloodPressureDiastolic() {
        return bloodPressureDiastolic;
    }

    public void setBloodPressureDiastolic(int bloodPressureDiastolic) {
        this.bloodPressureDiastolic = bloodPressureDiastolic;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getBloodoxygen() {
        return bloodoxygen;
    }

    public void setBloodoxygen(String bloodoxygen) {
        this.bloodoxygen = bloodoxygen;
    }

    public Date getCheckupdate() {
        return checkupdate;
    }

    public void setCheckupdate() {
        this.checkupdate = java.util.Calendar.getInstance().getTime();;
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
