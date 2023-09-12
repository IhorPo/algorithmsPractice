package creationalPatterns.abstractFactory.factory;

import creationalPatterns.abstractFactory.model.Transport;

public class TransportFactory {
    public static Transport getTransport(AbstractTransportFactory factory){
        return factory.create();
    }
}
