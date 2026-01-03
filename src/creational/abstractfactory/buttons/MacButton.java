package creational.abstractfactory.buttons;

public class MacButton implements Button {
    @Override
    public void press() {
        System.out.println("Running mac button");
    }
}
