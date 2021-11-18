/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.UserAccount;

import business.Business;
import business.Employee.Employee;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount findUserAccount(String Name){
    for(UserAccount res:userAccountList){
    if(res.getName().equals(Name)){
    return res;
    }
    }
    return null;
    }
    
    public void deleteUserAccount(UserAccount customer){
    userAccountList.remove(customer);
    }
    
    public UserAccount createUserAccount(Business system,String Name,String username, String password, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setName(Name);
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setRole(role);
        system.getUserAccountDirectory().getUserAccountList().add(userAccount);
        //userAccountList.add(userAccount);
        return userAccount;
    }
}
