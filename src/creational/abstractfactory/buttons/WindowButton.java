package creational.abstractfactory.buttons;

public class WindowButton implements Button {
    @Override
    public void press() {
        System.out.println("Running windows button");
    }
}
