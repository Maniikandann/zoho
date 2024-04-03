package combinedassignment5.com.library;

import java.util.Date;

import combinedassignment5.com.library.book.Book;
import combinedassignment5.com.library.member.Member;
import combinedassignment5.com.library.transaction.Transaction;

public class LibrarySystem {
	public static void main(String[] args) {

		Book book = new Book("Mahabharatham", "Vyasa", 2022);

		Member member = new Member("123456", "ManiCon", 22);

		Transaction transaction = new Transaction(book, member, new Date());
		System.out.println("Book: " + book.getTitle());
		System.out.println("Member: " + member.getName());
		System.out.println("Date of Transaction: " + transaction.getDate());
	}

}
