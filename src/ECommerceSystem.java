public class ECommerceSystem {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        ShoppingCart shoppingCart = new ShoppingCart();
        OrderProcessor orderProcessor = new OrderProcessor();

        Product product1 = new Product("Phone", 599.99, 10);
        Product product2 = new Product("Laptop", 899.99, 5);

        productManager.addProduct(product1);
        productManager.addProduct(product2);

        shoppingCart.addProductToCart(product1);
        shoppingCart.addProductToCart(product2);

        shoppingCart.removeProductFromCart(product1);

        productManager.displayProducts();

        orderProcessor.processOrder(shoppingCart);
    }
}