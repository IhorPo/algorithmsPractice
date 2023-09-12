package creationalPatterns.factory.factory;

import creationalPatterns.factory.dishes.Dish;
import creationalPatterns.factory.dishes.VegetarianDish;

public class RestaurantVegetarian extends Restaurant{
    @Override
    public Dish createDish() {
        return new VegetarianDish();
    }
}
