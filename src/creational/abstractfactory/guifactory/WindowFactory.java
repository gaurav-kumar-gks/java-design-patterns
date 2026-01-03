package creational.abstractfactory.guifactory;

import creational.abstractfactory.buttons.Button;
import creational.abstractfactory.checkbox.Checkbox;
import creational.abstractfactory.buttons.WindowButton;
import creational.abstractfactory.checkbox.WindowCheckbox;

public class WindowFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowCheckbox();
    }

}
