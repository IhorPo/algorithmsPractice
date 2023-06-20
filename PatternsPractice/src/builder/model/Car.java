package builder.model;

public class Car {
    private int id;
    private String brand;
    private String model;
    private String color;
    private String engine;
    private int numberOfDoors;

    Car(int id, String brand, String model, String color, String engine, int numberOfDoors) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
