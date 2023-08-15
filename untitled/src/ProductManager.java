import java.util.List;
import java.util.ArrayList;

public class ProductManager {

	
	List <Product> productList = new ArrayList<>();
	
	public void addProduct(Product product) {
		productList.add(product);
	}
	public void displayProducts() {

		for(Product product : productList) {
			System.out.println("Name: " + product.name +
                    ", Price: " + product.price +
                    ", Quantity: " + product.quantity);
		}
	}
}
