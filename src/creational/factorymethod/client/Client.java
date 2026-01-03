package creational.factorymethod.client;

import creational.factorymethod.logistics.Logistics;

public class Client {

    private Logistics logistics;

    public Client(Logistics logistics) {
        this.logistics = logistics;
    }

    public void setLogistics(Logistics logistics) {
        this.logistics = logistics;
    }

    public void run() {
        logistics.deliverGoods();
    }
}
