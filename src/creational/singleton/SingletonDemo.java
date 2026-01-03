package creational.singleton;

import creational.singleton.logger.NaiveLogger;
import creational.singleton.logger.BillPughLogger;

public class SingletonDemo {

    public static void run() {
        System.out.println("START: Singleton Pattern Demo ============\n");

        demonstrateNaiveSingleton();
        System.out.println();

        demonstrateThreadSafeSingleton();
        System.out.println();

        System.out.println("\nEND: Singleton Pattern Demo ============");
    }


    private static void demonstrateNaiveSingleton() {
        System.out.println("--- Naive Singleton (NOT Thread-Safe) ---");

        NaiveLogger.reset(); // Reset for clean demo

        NaiveLogger logger1 = NaiveLogger.getInstance();
        NaiveLogger logger2 = NaiveLogger.getInstance();

        System.out.println("Logger1 ID: " + logger1.getInstanceId());
        System.out.println("Logger2 ID: " + logger2.getInstanceId());
        System.out.println("Same instance? " + (logger1 == logger2));
        logger1.log("First log message");
        logger2.log("Second log message");
    }

    private static void demonstrateThreadSafeSingleton() {
        System.out.println("--- Thread-Safe Singleton ---");

        BillPughLogger logger1 = BillPughLogger.getInstance();
        BillPughLogger logger2 = BillPughLogger.getInstance();

        System.out.println("Logger1 ID: " + logger1.getInstanceId());
        System.out.println("Logger2 ID: " + logger2.getInstanceId());
        System.out.println("Same instance? " + (logger1 == logger2));
        logger1.log("First log message");
        logger2.log("Second log message");
    }
}
