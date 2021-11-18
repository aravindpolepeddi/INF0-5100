/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Restaurant;

import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aravindpolepeddi
 */
public class RestaurantDirectory {
    private ArrayList<Restaurant> restaurantList;

    public RestaurantDirectory() {
        restaurantList = new ArrayList<>();
    }
    
    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }
    
    public Restaurant findRestaurant(String Name){
    for(Restaurant res:restaurantList){
    if(res.getOwnerName().equals(Name)){
    return res;
    }
    }
    return null;
    }
    
    public void deleteRestaurant(Restaurant customer){
    restaurantList.remove(customer);
    }
    
    public Restaurant createRestaurantAccount(String RestaurantOwnerName,String RestaurantName,String Username, String password, Role role){
        Restaurant restaurant = new Restaurant();
        restaurant.setOwnerName(RestaurantOwnerName);
        restaurant.setRestaurantName(RestaurantName);
        restaurant.setUsername(Username);
        restaurant.setPassword(password);
        restaurant.setRole(role);
        restaurantList.add(restaurant);
        return restaurant;
    }
}
