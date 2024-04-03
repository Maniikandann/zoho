package combinedassignment5.com.library.transaction;

import java.util.Date;

import combinedassignment5.com.library.book.Book;
import combinedassignment5.com.library.member.Member;

public class Transaction {
	
	    private Book book;
	    private Member member;
	    private Date date;

	    public Transaction(Book book, Member member, Date date) {
	        this.book = book;
	        this.member = member;
	        this.date = date;
	    }

		public Book getBook() {
			return book;
		}

		public void setBook(Book book) {
			this.book = book;
		}

		public Member getMember() {
			return member;
		}

		public void setMember(Member member) {
			this.member = member;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

	    
	}


