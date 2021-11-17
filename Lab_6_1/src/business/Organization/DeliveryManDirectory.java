/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.DeliveryMan.DeliveryMan;
import business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author aravindpolepeddi
 */
class DeliveryManDirectory {
        private ArrayList<DeliveryMan> deliveryManList;

    public DeliveryManDirectory() {
        deliveryManList = new ArrayList<>();
    }

    public ArrayList<DeliveryMan> getDeliveryManList() {
        return deliveryManList;
    }
}
