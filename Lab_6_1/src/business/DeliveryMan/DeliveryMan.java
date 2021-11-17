/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.DeliveryMan;

import business.Business;
import business.Organization.Organization;
import business.Role.Role;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author aravindpolepeddi
 */
public class DeliveryMan extends Role{
    
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
    
        public DeliveryMan() {
        this.type = Role.RoleType.DeliveryMan;
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
    
    private String Address;

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business system) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
