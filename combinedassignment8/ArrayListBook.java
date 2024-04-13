package combinedassignment8;

import java.util.ArrayList;

class Book {
	private String title;
	private String author;
	private int year;

	public Book(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}

public class ArrayListBook {

	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<Book>();
		addbook(books, "MAHABRATHAM", "Vyasa", 2000);
		addbook(books, "RAMAYANAM", "Valmiki", 2001);
		for (Book book : books) {
			System.out.println("Title: " + book.getTitle() + "\nAuthor: " + book.getAuthor() + "\nYear: " + book.getYear() + "\n");
		}

	}

	public static void addbook(ArrayList<Book> books, String title, String author, int year) {
		Book book = new Book(title, author, year);
		books.add(book);

	}

}
