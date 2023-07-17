package abstractFactory.factory;

import abstractFactory.model.Car;
import abstractFactory.model.Transport;

public class CarFactory implements AbstractTransportFactory{
    private String name;
    private String model;

    public CarFactory(String name, String model){
        this.name = name;
        this.model = model;
    }
    @Override
    public Transport create() {
        return new Car(name, model);
    }
}
