package behavioral.strategy.shoppingcart;

import behavioral.strategy.discount.DiscountStrategy;
import behavioral.strategy.discount.NoDiscount;

public class ShoppingCart {
    private double totalAmount;
    private DiscountStrategy discountStrategy;

    public ShoppingCart(double totalAmount) {
        this.totalAmount = totalAmount;
        this.discountStrategy = new NoDiscount();
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double getFinalPrice() {
        return discountStrategy.applyDiscount(totalAmount);
    }
}