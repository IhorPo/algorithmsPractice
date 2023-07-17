package abstractFactory.factory;

import abstractFactory.model.Transport;

public class TransportFactory {
    public static Transport getTransport(AbstractTransportFactory factory){
        return factory.create();
    }
}
