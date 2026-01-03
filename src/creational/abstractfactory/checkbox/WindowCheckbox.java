package creational.abstractfactory.checkbox;

public class WindowCheckbox implements Checkbox {
    @Override
    public void check() {
        System.out.println("Running window checkbox");
    }
}
