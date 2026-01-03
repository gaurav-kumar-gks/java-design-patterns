package creational.factorymethod.logistics;

import creational.factorymethod.transport.Transport;

public abstract class Logistics {
    
    public abstract Transport createTransport();

    public void deliverGoods() {
        Transport transport = createTransport();
        transport.deliver();
    }
}
