/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.Customer.CustomerDirectory;
import business.DeliveryMan.DeliveryManDirectory;
import business.Organization.Organization;
import business.Organization.OrganizationDirectory;
import business.Restaurant.Restaurant;
import business.Restaurant.RestaurantDirectory;
import business.Role.Role;
import business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Business extends Organization {

    private static Business business;
    private OrganizationDirectory organizationDirectory;
    private CustomerDirectory customerDirectory;
    private UserAccountDirectory userAccountDirectory;
    private RestaurantDirectory restaurantDirectory;
    private DeliveryManDirectory deliveryManDirectory;

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }
    public static Business getInstance() {
        if (business == null) {
            business = new Business();
        }
        return business;
    }

    private Business() {
        super(null);
        organizationDirectory = new OrganizationDirectory();
        customerDirectory = new CustomerDirectory();
        restaurantDirectory = new RestaurantDirectory();
        deliveryManDirectory = new DeliveryManDirectory();
        userAccountDirectory = new UserAccountDirectory();
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }
    
    public RestaurantDirectory getRestaurantDirectory() {
        return restaurantDirectory;
    }
    
    public DeliveryManDirectory getDeliveryManDirectory() {
        return deliveryManDirectory;
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
