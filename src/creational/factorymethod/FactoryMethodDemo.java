package creational.factorymethod;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

import creational.factorymethod.client.Client;
import creational.factorymethod.logistics.Logistics;
import creational.factorymethod.logistics.RoadLogistics;
import creational.factorymethod.logistics.TrainLogistics;

public class FactoryMethodDemo {

    private static Client client;

    public static void run() {
        System.out.println("START: Factory Method demo -------------");
        runClient();
        System.out.println("END: Factory Method demo -------------");
    }

    private static void runClient() {
        if (client == null) {
            configureClient();
        }
        client.run();
    }

    private static void configureClient() {
        List<Supplier<Logistics>> logisticsSuppliers = List.of(
                RoadLogistics::new,
                TrainLogistics::new);

        Random random = new Random();
        Logistics selectedLogistics = logisticsSuppliers
                .get(random.nextInt(logisticsSuppliers.size()))
                .get();

        client = new Client(selectedLogistics);
    }
}
