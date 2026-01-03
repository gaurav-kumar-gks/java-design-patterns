package behavioral.observer.stock;

import java.util.concurrent.CopyOnWriteArrayList;

import behavioral.observer.event.Observer;
import behavioral.observer.event.Subject;

import java.util.List;

public class Stock implements Subject {

    private final String symbol;
    private final String name;
    private double price;
    private final List<Observer> observers;

    public Stock(String symbol, String name, double initialPrice) {
        this.symbol = symbol;
        this.name = name;
        this.price = initialPrice;
        this.observers = new CopyOnWriteArrayList<>();
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    /**
     * Updates the stock price and notifies all observers.
     * 
     * @param newPrice The new price
     */
    public void setPrice(double newPrice) {
        double oldPrice = this.price;
        this.price = newPrice;

        if (oldPrice != newPrice) {
            System.out.println(String.format("[%s] Price changed: $%.2f -> $%.2f (%.2f%%)",
                    symbol, oldPrice, newPrice, calculatePercentageChange(oldPrice, newPrice)));
            notifyObservers();
        }
    }

    private double calculatePercentageChange(double oldPrice, double newPrice) {
        if (oldPrice == 0)
            return 0;
        return ((newPrice - oldPrice) / oldPrice) * 100;
    }

    @Override
    public void subscribe(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
            System.out.println("Observer subscribed: " + observer.getClass().getSimpleName());
        }
    }

    @Override
    public void unsubscribe(Observer observer) {
        if (observers.remove(observer)) {
            System.out.println("Observer unsubscribed: " + observer.getClass().getSimpleName());
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            try {
                observer.update(this);
            } catch (Exception e) {
                System.err.println("Error notifying observer " + observer.getClass().getName() +
                        ": " + e.getMessage());
            }
        }
    }

    public int getObserverCount() {
        return observers.size();
    }

    @Override
    public String toString() {
        return String.format("Stock{symbol='%s', name='%s', price=$%.2f}",
                symbol, name, price);
    }
}
