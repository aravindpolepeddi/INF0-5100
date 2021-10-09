/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author aravindpolepeddi
 */
public class Fleet {
    
    private String CarModel;
    private String CarManufacturer;
    private Date MaintainanceExpiry;
    private int YearofManufacture;
    private String SerialNumber;
    private String AvailableCity;
    private int SeatingCapacity;
    private Date UpdateTime;
    private String Available;
    private String FileLocation;

    public String getFileLocation() {
        return FileLocation;
    }

    public void setFileLocation(String FileLocation) {
        this.FileLocation = FileLocation;
    }
    

    public String getAvailable() {
        return Available;
    }

    public void setAvailable(String Available) {
        this.Available = Available;
    }
    
    private FleetDirectory fleetdir;
    
    
    public FleetDirectory getFleetDirectory(){
        return fleetdir;
    }
    
    public void setFleetDirectory(FleetDirectory fleetdirectory) {
        this.fleetdir = fleetdirectory;
    }
    
    public Date getUpdatedTime(){
        return UpdateTime;
    
    }

    public Date getUpdateTime() {
        return UpdateTime;
    }

    public void setUpdateTime() {
        this.UpdateTime = java.util.Calendar.getInstance().getTime();
    }

    public String getCarModel() {
        return CarModel;
    }

    public void setCarModel(String CarModel) {
        this.CarModel = CarModel;
    }

    public String getCarManufacturer() {
        return CarManufacturer;
    }

    public void setCarManufacturer(String CarManufacturer) {
        this.CarManufacturer = CarManufacturer;
    }

    public Date getMaintainanceExpiry() {
        return MaintainanceExpiry;
    }

    public void setMaintainanceExpiry(Date MaintainanceExpiry) {
        this.MaintainanceExpiry = MaintainanceExpiry;
    }

    public int getYearofManufacture() {
        return YearofManufacture;
    }

    public void setYearofManufacture(int YearofManufacture) {
        this.YearofManufacture = YearofManufacture;
    }

    public String getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    public String getAvailableCity() {
        return AvailableCity;
    }

    public void setAvailableCity(String AvailableCity) {
        this.AvailableCity = AvailableCity;
    }

    public int getSeatingCapacity() {
        return SeatingCapacity;
    }

    public void setSeatingCapacity(int SeatingCapacity) {
        this.SeatingCapacity = SeatingCapacity;
    }
}
