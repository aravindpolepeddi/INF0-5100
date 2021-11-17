/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Restaurant;

import business.Role.Role;
import business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author aravindpolepeddi
 */
public class Restaurant {
    
    private String RestaurantName;
    private String OwnerName;
    private String username;
    private String password;
    private ArrayList<Item> menu = new ArrayList<>();
    private Role role;
    private int id;
    private static int count = 1;
    private WorkQueue workQueue;
    
    Restaurant(){
    workQueue = new WorkQueue();
    }
    
    public String getOwnerName() {
        return OwnerName;
    }
    
    public void setOwnerName(String name) {
        OwnerName=name;
    }
    
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

    public Role getRole() {
        return role;
    }

    public String getRestaurantName() {
        return RestaurantName;
    }

    public void setRestaurantName(String RestaurantName) {
        this.RestaurantName = RestaurantName;
    }
    
    public void setRole(Role role) {
        this.role = role;
    }
    
    public void addItem(Item item){
        menu.add(item);
    }
    
    public void removeItem(Item item){
        menu.remove(item);
    }

    public ArrayList<Item> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<Item> menu) {
        this.menu = menu;
    }
}
