package creational.abstractfactory.guifactory;

import creational.abstractfactory.buttons.Button;
import creational.abstractfactory.checkbox.Checkbox;
import creational.abstractfactory.buttons.MacButton;
import creational.abstractfactory.checkbox.MacCheckbox;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }

}
