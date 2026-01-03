package behavioral.observer.stock;

import behavioral.observer.event.Observer;

public class EmailAlert implements Observer {

    private final String email;
    private final double threshold;
    private final AlertType alertType;

    public enum AlertType {
        PRICE_INCREASE,
        PRICE_DECREASE
    }

    public EmailAlert(String email, double threshold, AlertType alertType) {
        this.email = email;
        this.threshold = threshold;
        this.alertType = alertType;
    }

    @Override
    public void update(Stock stock) {
        double currentPrice = stock.getPrice();

        boolean shouldAlert = false;
        String message = "";

        switch (alertType) {
            case PRICE_INCREASE:
                shouldAlert = currentPrice >= threshold;
                message = String.format("Price increased to $%.2f (threshold: $%.2f)",
                        currentPrice, threshold);
                break;
            case PRICE_DECREASE:
                shouldAlert = currentPrice <= threshold;
                message = String.format("Price decreased to $%.2f (threshold: $%.2f)",
                        currentPrice, threshold);
                break;
        }

        if (shouldAlert) {
            sendEmail(stock, message);
        }
    }

    private void sendEmail(Stock stock, String message) {
        System.out.printf(
                "[EmailAlert] Sending email to %s: %s - %s\n\n",
                email, stock.getSymbol(), message);
    }
}
