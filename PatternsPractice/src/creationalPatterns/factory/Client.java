package creationalPatterns.factory;

import creationalPatterns.factory.factory.Restaurant;
import creationalPatterns.factory.factory.RestaurantNonVegetarian;
import creationalPatterns.factory.factory.RestaurantVegetarian;

public class Client {
    public static void main(String[] args) {
        Restaurant vegRes = new RestaurantVegetarian();
        vegRes.order();

        Restaurant nonVegRes = new RestaurantNonVegetarian();
        nonVegRes.order();
        
    }
}
