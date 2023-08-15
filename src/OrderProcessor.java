

public class OrderProcessor {
    public void processOrder(ShoppingCart cart) {
        System.out.println("Order Summary:");
        for (Product product : cart.cartItems) {
            System.out.println("Product: " + product +
                               ", Price: " + product);
        }
       
    }
}
