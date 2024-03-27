package combinedassignment2;

class Books {

	private String title;
	private String isbn;
	private String author;
	private double price;

	private static int numberOfBooks = 0;

	public Books(String title, String isbn, String author, double price) {
		this.title = title;
		this.isbn = isbn;
		this.author = author;
		this.price = price;
		numberOfBooks++;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getISBN() {
		return isbn;
	}

	public void setISBN(String isbn) {
		this.isbn = isbn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static int getNumberOfBooks() {
		return numberOfBooks;
	}

	public static void displayBookInfo(Books book) {
		System.out.println("Title: " + book.getTitle());
		System.out.println("ISBN: " + book.getISBN());
		System.out.println("Author: " + book.getAuthor());
		System.out.println("Price: $" + book.getPrice());
	}
}

public class Book {
	public static void main(String[] args) {

		Books book1 = new Books("MAHABRATHAM", "978-0743273565", "Vyasa", 9.99);
		Books book2 = new Books("RAMAYANAM", "978-0061120084", "Valmiki", 7.99);

		System.out.println("Book 1:");
		Books.displayBookInfo(book1);
		System.out.println();

		System.out.println("Book 2:");
		Books.displayBookInfo(book2);
		System.out.println();

		book1.setPrice(10.99);
		book2.setPrice(8.49);

		System.out.println("Updated Book 1:");
		Books.displayBookInfo(book1);
		System.out.println();

		System.out.println("Updated Book 2:");
		Books.displayBookInfo(book2);
		System.out.println();

		System.out.println("Total number of books: " + Books.getNumberOfBooks());
	}
}
