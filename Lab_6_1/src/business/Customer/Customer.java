/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Customer;

import business.Business;
import business.Organization.Organization;
import business.Restaurant.Item;
import business.Role.Role;
import business.UserAccount.UserAccount;
import business.WorkQueue.WorkQueue;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author aravindpolepeddi
 */
public class Customer {
    private String Name;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    private String username;
    private String password;
    private String Address;
    private ArrayList<Item> customermenu;

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    private Item item = new Item();
    private WorkQueue workQueue;

    public ArrayList<Item> getMenu() {
        return customermenu;
    }

    public void setMenu(ArrayList<Item> menu) {
        this.customermenu = menu;
    }
    private int id;
    private static int count = 1;
    
    public Customer(){
     workQueue = new WorkQueue();
     customermenu = new ArrayList<>();
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    public void addtoCustomerMenu(Item item) {
        this.customermenu.add(item);
    }
    
    public void removefromCustomerMenu(Item item) {
        customermenu.remove(item);
    }    

}
