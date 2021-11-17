/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.AdminRole;
import business.Role.RestaurantOwner;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class RestaurantOwnerOrganization extends Organization{

    public RestaurantOwnerOrganization() {
        super(Organization.Type.RestaurantOwner.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new RestaurantOwner()); 
        return roles;
    }
     
}
