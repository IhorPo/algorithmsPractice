package creationalPatterns.factory.factory;

import creationalPatterns.factory.dishes.Dish;
import creationalPatterns.factory.dishes.NonVegetarianDish;

public class RestaurantNonVegetarian extends Restaurant{
    @Override
    public Dish createDish() {
        return new NonVegetarianDish();
    }
}
