/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.Business;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.DeliveryMan.DeliveryWorkAreaJpanel;

/**
 *
 * @author raunak
 */
public class DeliverymanRole extends Role {

    public DeliverymanRole() {
        this.type = RoleType.DeliveryMan;
    }

/*    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        this.type = RoleType.DeliveryMan;
        return new DeliveryManWorkAreaJPanel(userProcessContainer, account, organization, business);
    }
*/

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business system) {
        return new DeliveryWorkAreaJpanel(userProcessContainer,account,organization,system);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
