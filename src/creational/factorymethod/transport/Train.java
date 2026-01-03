package creational.factorymethod.transport;

public class Train implements Transport {
    @Override
    public void deliver() {
        System.out.println("Train is delivering goods");
    }
}
