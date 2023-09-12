package creationalPatterns.builder.model;

public class CarBuilder implements Builder{
    private int id;
    private String brand;
    private String model;
    private String color;
    private String engine;
    private int numberOfDoors;

    @Override
    public Builder id(int id) {
        this.id = id;
        return this;
    }

    @Override
    public Builder brand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public Builder model(String model) {
        this.model = model;
        return this;
    }

    @Override
    public Builder color(String color) {
        this.color = color;
        return this;
    }

    @Override
    public Builder engine(String engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public Builder numberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }
    public Car build(){
        return new Car(id,brand,model,color,engine,numberOfDoors);
    }
}
