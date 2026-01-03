package creational.factorymethod.logistics;

import creational.factorymethod.transport.Transport;
import creational.factorymethod.transport.Train;

public class TrainLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Train();
    }
}
