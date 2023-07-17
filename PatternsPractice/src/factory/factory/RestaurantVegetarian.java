package factory.factory;

import factory.dishes.Dish;
import factory.dishes.VegetarianDish;

public class RestaurantVegetarian extends Restaurant{
    @Override
    public Dish createDish() {
        return new VegetarianDish();
    }
}
