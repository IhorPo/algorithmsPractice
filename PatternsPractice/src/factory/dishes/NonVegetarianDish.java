package factory.dishes;

public class NonVegetarianDish implements Dish{
    @Override
    public void create() {
        System.out.println("Non vegetarian dish created");
    }
}
