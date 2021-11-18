/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Order;

import java.util.ArrayList;

/**
 *
 * @author aravindpolepeddi
 */
public class OrderDirectory {
  private ArrayList<Order> orderdir = new ArrayList<Order>();

    public ArrayList<Order> getOrderdir() {
        return orderdir;
    }

    public void setOrderdir(ArrayList<Order> orderdir) {
        this.orderdir = orderdir;
    }
    
    public void addOrder(Order order){
    orderdir.add(order);
    }
    
    public Order findOrder(int id) {
Order order = orderdir.stream().filter(x -> x.getIndex() == id).findAny().orElse(null);
return order;
}
    
}
