package behavioral.observer.stock;

import behavioral.observer.event.Observer;

public class SMSAlert implements Observer {

    private final String phoneNumber;
    private final double threshold;

    public SMSAlert(String phoneNumber, double threshold) {
        this.phoneNumber = phoneNumber;
        this.threshold = threshold;
    }

    @Override
    public void update(Stock stock) {
        double currentPrice = stock.getPrice();

        if (currentPrice >= threshold) {
            sendSMS(stock, currentPrice);
        }
    }

    private void sendSMS(Stock stock, double price) {
        System.out.printf(
                "[SMSAlert] Sending SMS to %s: %s price reached $%.2f (threshold: $%.2f) \n\n",
                phoneNumber, stock.getSymbol(), price, threshold);
    }
}
