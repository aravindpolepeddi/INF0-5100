/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Order;

import business.Restaurant.Item;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author aravindpolepeddi
 */
public class Order {
    private String CustomerName;
    private String RestaurantName;
    private String DeliveryManName;
    private String OrderTime;
    private String DeliveryTime;
    private String Status;
    private int index=0;
    private ArrayList<Item> orderItems;
    private String Feedback;

    public String getFeedback() {
        return Feedback;
    }

    public void setFeedback(String Feedback) {
        this.Feedback = Feedback;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public ArrayList<Item> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(ArrayList<Item> orderItems) {
        this.orderItems = orderItems;
    }

    public String getRestaurantName() {
        return RestaurantName;
    }

    public void setRestaurantName(String RestaurantName) {
        this.RestaurantName = RestaurantName;
    }

    public String getDeliveryManName() {
        return DeliveryManName;
    }

    public void setDeliveryManName(String DeliveryManName) {
        this.DeliveryManName = DeliveryManName;
    }

    public String getOrderTime() {
        return OrderTime;
    }

    public void setOrderTime(String OrderTime) {
        this.OrderTime = OrderTime;
    }

    public String getDeliveryTime() {
        return DeliveryTime;
    }

    public void setDeliveryTime(String DeliveryTime) {
        this.DeliveryTime = DeliveryTime;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    public void setOrderItems(Item item) {
        orderItems.add(item);
    }
    
    @Override
    public String toString(){
    return String.valueOf(index);
    }
}
