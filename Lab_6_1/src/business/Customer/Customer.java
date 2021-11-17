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
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author aravindpolepeddi
 */
public class Customer extends Role {
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
    private ArrayList<Item> customermenu = new ArrayList<>();
    private Item item;

    public ArrayList<Item> getMenu() {
        return customermenu;
    }

    public void setMenu(ArrayList<Item> menu) {
        this.customermenu = menu;
    }
    private int id;
    private static int count = 1;
    
    Customer(){
    this.type = Role.RoleType.Customer;
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
    
    public void addtoCustomerMenu(String name,int price) {
        this.item.setItemName(name);
        this.item.setPrice(price);
        customermenu.add(item);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business system) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
