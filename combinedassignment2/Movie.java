package combinedassignment2;
class MovieDTO {
    // Instance variables
    private String title;
    private String director;
    private int releaseYear;
    private double rating;
    
    // Constructor
    public MovieDTO(String title, String director, int releaseYear, double rating) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }
    
    // Getter methods
    public String getTitle() {
        return title;
    }
    
    public String getDirector() {
        return director;
    }
    
    public int getReleaseYear() {
        return releaseYear;
    }
    
    public double getRating() {
        return rating;
    }
    
    // Setter methods
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setDirector(String director) {
        this.director = director;
    }
    
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    
    public void setRating(double rating) {
        this.rating = rating;
    }

    public void show() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Rating: " + rating);
    }
}

public class Movie {
	public static void main(String[] args) {
		MovieDTO m=new MovieDTO("Muthal Mariyathai","Bharathiraja",1985,10);
		m.show();
	}

}
