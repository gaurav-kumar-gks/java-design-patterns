package creational.factorymethod.logistics;

import creational.factorymethod.transport.Transport;
import creational.factorymethod.transport.Truck;

public class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
