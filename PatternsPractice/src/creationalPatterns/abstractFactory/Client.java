package creationalPatterns.abstractFactory;

import creationalPatterns.abstractFactory.factory.CarFactory;
import creationalPatterns.abstractFactory.factory.ShipFactory;
import creationalPatterns.abstractFactory.factory.TransportFactory;
import creationalPatterns.abstractFactory.model.Transport;

public class Client {
    public static void main(String[] args) {
        Transport car = TransportFactory.getTransport(new CarFactory("BMW","blue"));
        Transport ship = TransportFactory.getTransport(new ShipFactory("Submarine","medium"));
    }
}
