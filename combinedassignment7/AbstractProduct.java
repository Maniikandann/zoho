package combinedassignment7;

abstract class Product {
	protected String description;
	protected double price;

	public Product(String description, double price) {
		this.description = description;
		this.price = price;
	}

	public abstract String getDescription();

	public abstract double getPrice();
}

class ElectronicsProduct extends Product {
	public ElectronicsProduct(String description, double price) {
		super(description, price);
	}

	public String getDescription() {
		return "Electronics: " + description;
	}

	public double getPrice() {
		return price;
	}
}

class ClothingProduct extends Product {
	public ClothingProduct(String description, double price) {
		super(description, price);
	}

	public String getDescription() {
		return "Clothing: " + description;
	}

	public double getPrice() {
		return price;
	}
}

class BookProduct extends Product {
	public BookProduct(String description, double price) {
		super(description, price);
	}

	public String getDescription() {
		return "Book: " + description;
	}

	public double getPrice() {
		return price;
	}
}

class ShoppingCart {
	private Product[] products;
	private int count;

	public ShoppingCart(int capacity) {
		products = new Product[capacity];
		count = 0;
	}

	public void addProduct(Product product) {
		if (count < products.length) {
			products[count++] = product;
		} else {
			System.out.println("Shopping cart is full. Cannot add more products.");
		}
	}

	public double calculateTotalPrice() {
		double totalPrice = 0;
		for (int i = 0; i < count; i++) {
			totalPrice += products[i].getPrice();
		}
		return totalPrice;
	}

	public void displayCart() {
		System.out.println("Shopping Cart Contents:");
		for (int i = 0; i < count; i++) {
			System.out.println(products[i].getDescription() + " - Price: $" + products[i].getPrice());
		}
	}
}

public class AbstractProduct {
	public static void main(String[] args) {

		Product electronics = new ElectronicsProduct("Smartphone", 500);
		Product clothing = new ClothingProduct("T-Shirt", 20);
		Product book = new BookProduct("Java Programming", 50);

		ShoppingCart cart = new ShoppingCart(5);

		cart.addProduct(electronics);
		cart.addProduct(clothing);
		cart.addProduct(book);
		cart.addProduct(book);
		cart.addProduct(electronics);
		cart.addProduct(book);

		cart.displayCart();

		System.out.println("Total Price: $" + cart.calculateTotalPrice());
	}
}
