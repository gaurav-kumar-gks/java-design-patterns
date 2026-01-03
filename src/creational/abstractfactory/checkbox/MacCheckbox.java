package creational.abstractfactory.checkbox;

public class MacCheckbox implements Checkbox {
    @Override
    public void check() {
        System.out.println("Running mac checkbox");
    }
}
