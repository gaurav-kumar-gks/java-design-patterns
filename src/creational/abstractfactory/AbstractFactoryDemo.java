package creational.abstractfactory;

import creational.abstractfactory.guifactory.WindowFactory;
import creational.abstractfactory.client.Client;
import creational.abstractfactory.guifactory.MacFactory;

public class AbstractFactoryDemo {
    public static void run() {
        System.out.println("START: Abstract Factory demo -------------");

        Client app = new Client(new WindowFactory());
        app.run();
        app.setFactory(new MacFactory());
        app.run();

        System.out.println("END: Abstract Factory demo -------------");
    }
}
