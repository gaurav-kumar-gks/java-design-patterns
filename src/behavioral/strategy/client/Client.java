package behavioral.strategy.client;

import behavioral.strategy.shoppingcart.ShoppingCart;
import behavioral.strategy.discount.DiwaliDiscount;

public class Client {
    public static void run() {
        ShoppingCart cart = new ShoppingCart(200.00);
        System.out.println("No Discount: " + cart.getFinalPrice());

        cart.setDiscountStrategy(new DiwaliDiscount());
        System.out.println("Diwali Discount: " + cart.getFinalPrice());
    }
}
