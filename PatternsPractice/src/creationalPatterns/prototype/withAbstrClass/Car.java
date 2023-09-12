package creationalPatterns.prototype.withAbstrClass;

public class Car extends Transport{
    private String brand;

    public Car(int id, String brand, String color) {
        super(id,color);
        this.brand = brand;
    }

    public Car(Car car){
        super(car);
        this.brand = car.brand;
    }


    @Override
    public Transport clone() {
        return new Car(this);
    }

    @Override
    public String toString() {
        return super.toString() +"Car{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
