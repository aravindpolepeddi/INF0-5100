/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.AdminRole;
import business.Role.DeliverymanRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class DeliveryOrganization extends Organization{

    public DeliveryOrganization() {
        super(Organization.Type.DeliveryMan.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DeliverymanRole()); 
        return roles;
    }
     
}
