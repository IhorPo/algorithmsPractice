package abstractFactory;

import abstractFactory.factory.CarFactory;
import abstractFactory.factory.ShipFactory;
import abstractFactory.factory.TransportFactory;
import abstractFactory.model.Transport;

public class Client {
    public static void main(String[] args) {
        Transport car = TransportFactory.getTransport(new CarFactory("BMW","blue"));
        Transport ship = TransportFactory.getTransport(new ShipFactory("Submarine","medium"));
    }
}
