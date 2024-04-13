package combinedassignment8;

import java.util.ArrayList;

public class DeleteBook {
	
	public static void deleteBook(ArrayList<Book> books, String title) {
		Book bookToRemove = null;
		for (Book book : books) {
			if (book.getTitle().equals(title)) {
				bookToRemove = book;
				break; 
			}
		}
		if (bookToRemove != null) {
			books.remove(bookToRemove);
		}
	}
}
