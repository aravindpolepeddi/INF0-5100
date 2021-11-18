/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Customer;

import java.util.ArrayList;

/**
 *
 * @author aravindpolepeddi
 */
public class CustomerDirectory {
     private ArrayList<Customer> customerList;

    public CustomerDirectory() {
        customerList = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    } 
    
    public Customer findCustomer(String Name){
    for(Customer cus:customerList){
    if(cus.getName().equals(Name)){
    return cus;
    }
    }
    return null;
    }
    
    public void deleteCustomer(Customer customer){
    customerList.remove(customer);
    }
    
        public Customer createCustomer(String name,String username, String password){
        Customer customer = new Customer();
        customer.setName(name);
        customer.setUsername(username);
        customer.setPassword(password);
        customerList.add(customer);
        return customer;
    }
}
