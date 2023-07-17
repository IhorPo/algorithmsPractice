package factory.factory;

import factory.dishes.Dish;
import factory.dishes.NonVegetarianDish;

public class RestaurantNonVegetarian extends Restaurant{
    @Override
    public Dish createDish() {
        return new NonVegetarianDish();
    }
}
