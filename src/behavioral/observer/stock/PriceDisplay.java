package behavioral.observer.stock;

import behavioral.observer.event.Observer;

public class PriceDisplay implements Observer {

    private final String displayName;

    public PriceDisplay(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public void update(Stock stock) {
        System.out.printf(
                "[%s] %s | %s: $%.2f \n\n",
                displayName, stock.getSymbol(), stock.getName(), stock.getPrice());
    }
}
