package factory;

import factory.factory.Restaurant;
import factory.factory.RestaurantNonVegetarian;
import factory.factory.RestaurantVegetarian;

public class Client {
    public static void main(String[] args) {
        Restaurant vegRes = new RestaurantVegetarian();
        vegRes.order();

        Restaurant nonVegRes = new RestaurantNonVegetarian();
        nonVegRes.order();
        
    }
}
