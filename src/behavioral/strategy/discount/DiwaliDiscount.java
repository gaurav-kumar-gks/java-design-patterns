package behavioral.strategy.discount;

public class DiwaliDiscount implements DiscountStrategy {
    public double applyDiscount(double totalAmount) {
        return totalAmount * 0.8;
    }
}
