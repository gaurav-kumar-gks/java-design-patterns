package creational.abstractfactory.guifactory;

import creational.abstractfactory.buttons.Button;
import creational.abstractfactory.checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

