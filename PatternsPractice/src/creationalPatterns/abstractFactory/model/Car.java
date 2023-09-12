package creationalPatterns.abstractFactory.model;

public class Car implements Transport{
    private String name;
    private String color;

    public Car(String name,String color){
        this.name = name;
        this.color = color;
    }
    @Override
    public void ride() {
        System.out.println("Ride on car");
    }
    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
