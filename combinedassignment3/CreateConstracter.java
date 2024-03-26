package combinedassignment3;

class Book {
	private String title;
	private String author;
	private int pages;

	public Book(String title, String author, int pages) {
		this.title = title;
		this.author = author;
		this.pages = pages;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPages() {
		return pages;
	}
}

public class CreateConstracter {
	public static void main(String[] args) {

		Book[] books = new Book[3];

		books[0] = new Book("Book1", "Author1", 200);
		books[1] = new Book("Book2", "Author2", 300);
		books[2] = new Book("Book3", "Author3", 250);

		displayBooks(books);
	}

	public static void displayBooks(Book[] books) {
		System.out.println("Books Added:\n");

		for (Book book : books) {
			System.out.println("Title: " + book.getTitle());
			System.out.println("Author: " + book.getAuthor());
			System.out.println("Pages: " + book.getPages());
			System.out.println();
		}
	}
}
