/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.Business;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.customer.CustomerWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class Customer extends Role {

    public Customer() {
        this.type = RoleType.Customer;
    }
/*
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        this.type = RoleType.Customer;
        return new CustomerWorkAreaJPanel(userProcessContainer, account, organization, business);
    }
*/

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business system) {
        
        return new CustomerWorkAreaJPanel(userProcessContainer,account,organization,system);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
