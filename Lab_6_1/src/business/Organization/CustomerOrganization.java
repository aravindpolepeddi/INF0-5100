/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.AdminRole;
import business.Role.Customer;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class CustomerOrganization extends Organization{

    public CustomerOrganization() {
        super(Organization.Type.Customer.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new Customer()); 
        return roles;
    }
     
}
