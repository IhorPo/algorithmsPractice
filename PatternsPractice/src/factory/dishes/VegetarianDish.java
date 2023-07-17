package factory.dishes;

public class VegetarianDish implements Dish{
    @Override
    public void create() {
        System.out.println("Vegetarian dish created");
    }
}
