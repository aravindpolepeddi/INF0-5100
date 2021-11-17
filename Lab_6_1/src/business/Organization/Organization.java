/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Customer.CustomerDirectory;
import business.Employee.EmployeeDirectory;
import business.Restaurant.RestaurantDirectory;
import business.Role.Role;
import business.UserAccount.UserAccountDirectory;
import business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;
    
    public enum Type{
        Admin("Admin Organization") {
//            //@Override
//            public Organization createOrganization() {
//                return new AdminOrganization();
//            }
        }, RestaurantOwner("Restaurant Organization"){
//            public Organization createOrganization() {
//                return new DoctorOrganization();
//            }
        },DeliveryMan ("DeliveryMan Organization"){
//            public Organization createOrganization() {
//                return new LabOrganization();
//            }
        }, Customer("Customer Organization"){
//            public Organization createOrganization() {
//                return new DoctorOrganization();
//            }
        };
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
//        public Organization createOrganization(Type t) {
//            return t.createOrganization();
//        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
