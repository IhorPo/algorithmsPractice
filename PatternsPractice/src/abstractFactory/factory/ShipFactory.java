package abstractFactory.factory;

import abstractFactory.model.Transport;
import abstractFactory.model.Ship;
public class ShipFactory implements AbstractTransportFactory {
    private String name;
    private String size;

    public ShipFactory(String name, String size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public Transport create() {
        return new Ship(name, size);
    }
}
