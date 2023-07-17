package factory.factory;

import factory.dishes.Dish;

public abstract class Restaurant {

    public void order(){
        System.out.println("Ordering food");
        Dish dish = createDish();
        dish.create();
    }
    public abstract Dish createDish();
}
