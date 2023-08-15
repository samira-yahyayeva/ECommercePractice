import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	/***Class 3: ShoppingCart** --> team Daniela
- Description: Represents a shopping cart containing products and calculating the total cost.
- Variables:
  - `cartItems` (List<Product>): A list of products added to the shopping cart.
- Methods:
  - `addProductToCart(Product product)`: Adds a `Product` object to the `cartItems`.
  - `removeProductFromCart(Product product)`: Removes a `Product` object from the `cartItems`.
  - `calculateTotalCost()`: Calculates and returns the total cost of products in the cart.
  */
	
	
	
	List <Product> cartItems = new ArrayList<>();
	
	public void addProductToCart (Product product) {
		cartItems.add(product);
		
	}
	
	public void removeProductFromCart (Product product) {
		
		cartItems.remove(product);
		
				
			}
	
	public double calculateTotalCost () {
		
		double totalCost = 0;
		
		for (Product product: cartItems ) {
			
			totalCost+=product.price;
		}
		
		return totalCost;
	}
	
	
	

}
