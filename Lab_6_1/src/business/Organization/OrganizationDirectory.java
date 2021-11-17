/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Customer.getValue())){
            organization = new CustomerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.DeliveryMan.getValue())){
            organization = new DeliveryOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.RestaurantOwner.getValue())){
            organization = new RestaurantOwnerOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}