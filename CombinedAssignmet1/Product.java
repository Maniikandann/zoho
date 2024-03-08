package CombinedAssignmet1;

public class Product {
	String name;
	int id;
	int price;
	boolean inStock;

	public Product(String name, int id, int price, boolean inStock) {
		this.name = name;
		this.id = id;
		this.price = price;
		this.inStock = inStock;
	}

	public void printProductDetails() {
		System.out.println("Product Name: " + name);
		System.out.println("Product ID: " + id);
		System.out.println("Product Price: " + price);
		System.out.println("In Stock: " + inStock);
	}

	public static void main(String[] args) {

		Product product = new Product("VIVO", 1001, 12990, true);
		product.printProductDetails();
	}
}
