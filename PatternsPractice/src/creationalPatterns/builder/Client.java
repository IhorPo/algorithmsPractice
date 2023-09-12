package creationalPatterns.builder;


import creationalPatterns.builder.model.Car;
import creationalPatterns.builder.model.CarBuilder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        // create lambo
        director.buildLambo(carBuilder);
        // generate lambo
        Car lambo = carBuilder.build();
        System.out.println(lambo);
    }
}
