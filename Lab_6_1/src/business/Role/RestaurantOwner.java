/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.Business;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.RestaurantOwnerRole.RestaurantWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class RestaurantOwner extends Role {

    public RestaurantOwner() {
        this.type = RoleType.RestaurantOwner;
    }
/*
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        this.type = RoleType.RestaurantOwner;
        return new RestaurantAreaWorkAreaJPanel(userProcessContainer, account, organization, business);
    }
*/

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business system) {
        
        return new RestaurantWorkAreaJPanel(userProcessContainer,account,organization,system); //To change body of generated methods, choose Tools | Templates.
    }
}
