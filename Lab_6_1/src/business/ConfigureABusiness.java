/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.Employee.Employee;
import business.Organization.AdminOrganization;
import business.Role.AdminRole;
import business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author neeraj
 */
public class ConfigureABusiness {
    
    public static Business configure(){
        
        Business business = Business.getInstance();
        
        AdminOrganization adminOrganization = new AdminOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(adminOrganization);

        
        UserAccount account = new UserAccount();
        account.setName("admin");
        account.setUsername("admin");
        account.setPassword("admin");
        account.setRole(new AdminRole());
        business.getUserAccountDirectory().getUserAccountList().add(account);
        
        adminOrganization.getUserAccountDirectory().getUserAccountList().add(account);
        
        return business;
    }
    
}
