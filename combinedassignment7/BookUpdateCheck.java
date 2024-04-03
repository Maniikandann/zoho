package combinedassignment7;

public class BookUpdateCheck {

	public class Book {

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

		public void updateBookInformation(String username, String password, String newTitle, String newAuthor,
				int newYearPublished) {

			if (authenticateUser(username, password)) {
				this.title = newTitle;
				this.author = newAuthor;
				this.year = newYearPublished;
				System.out.println("Book information updated successfully.");
			} else {
				System.out.println("Unauthorized user.");
			}
		}

		private boolean authenticateUser(String username, String password) {

			return username.equals("admin") && password.equals("password");
		}
	}
}
