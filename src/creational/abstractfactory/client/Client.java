package creational.abstractfactory.client;

import creational.abstractfactory.guifactory.GUIFactory;
import creational.abstractfactory.buttons.Button;
import creational.abstractfactory.checkbox.Checkbox;

public class Client {

    private Button button;
    private Checkbox checkbox;

    public Client(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void setFactory(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void run() {
        button.press();
        checkbox.check();
    }
}
