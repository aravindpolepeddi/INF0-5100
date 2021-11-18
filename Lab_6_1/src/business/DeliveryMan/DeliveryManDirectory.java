/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.DeliveryMan;

import business.Customer.Customer;
import business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author aravindpolepeddi
 */
public class DeliveryManDirectory {
     private ArrayList<DeliveryMan> deliveryManList;

    public DeliveryManDirectory() {
        deliveryManList = new ArrayList<>();
    }

    public ArrayList<DeliveryMan> getDeliveryManList() {
        return deliveryManList;
    }   
    
    public DeliveryMan createDeliveryMan(String Name,String Username, String password){
        DeliveryMan deliveryMan = new DeliveryMan();
        deliveryMan.setName(Name);
        deliveryMan.setUsername(Username);
        deliveryMan.setPassword(password);
        deliveryManList.add(deliveryMan);
        return deliveryMan;
    }
    
    public DeliveryMan findDeliveryMan(String Name){
    for(DeliveryMan cus:deliveryManList){
    if(cus.getName().equals(Name)){
    return cus;
    }
    }
    return null;
    }
    
    public void deleteDeliveryMan(DeliveryMan customer){
    deliveryManList.remove(customer);
    }
    
}
