package behavioral.observer;

import behavioral.observer.stock.EmailAlert;
import behavioral.observer.stock.PriceDisplay;
import behavioral.observer.stock.SMSAlert;
import behavioral.observer.stock.Stock;

public class ObserverDemo {

    public static void run() {
        System.out.println("START: Observer demo ------------- \n");

        Stock appleStock = new Stock("AAPL", "Apple Inc.", 150.00);

        EmailAlert emailAlert = new EmailAlert(
                "trader@example.com",
                160.00,
                EmailAlert.AlertType.PRICE_INCREASE);
        SMSAlert smsAlert = new SMSAlert("1234", 155.00);
        PriceDisplay dashboard = new PriceDisplay("Trading Dashboard");
        PriceDisplay mobileApp = new PriceDisplay("Mobile App");

        System.out.println("--- Subscribing Observers ---\n");
        appleStock.subscribe(emailAlert);
        appleStock.subscribe(smsAlert);
        appleStock.subscribe(dashboard);
        appleStock.subscribe(mobileApp);
        System.out.printf("Total observers: %d\n\n", appleStock.getObserverCount());

        System.out.println("--- Simulating Price Changes ---\n");
        appleStock.setPrice(160.50);

        System.out.println("--- Unsubscribing Observer ---");
        appleStock.unsubscribe(mobileApp);
        System.out.printf("Remaining observers: %d \n\n", appleStock.getObserverCount());

        System.out.println("--- Final Price Change ---");
        appleStock.setPrice(155.00);

        System.out.println("END: Observer demo -------------");
    }
}
