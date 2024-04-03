package combinedassignment7;



abstract class Movie {
    private String title;
    private int year;

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Year: " + year);
    }
    
    public abstract String getGenre();
}

class RomComMovie extends Movie {
    private String mainActor;
    private String mainActress;

    public RomComMovie(String title, int year, String mainActor, String mainActress) {
        super(title, year);
        this.mainActor = mainActor;
        this.mainActress = mainActress;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Main Actor: " + mainActor);
        System.out.println("Main Actress: " + mainActress);
    }

   
    public String getGenre() {
        return "Romantic Comedy";
    }
}

class ThrillerMovie extends Movie {
    private String director;

    public ThrillerMovie(String title, int year, String director) {
        super(title, year);
        this.director = director;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Director: " + director);
    }

  
    public String getGenre() {
        return "Thriller";
    }
}

public class AbstractMovie {
    public static void main(String[] args) {

        Movie movie1 = new RomComMovie("Yaaradi Nee Mohini", 2008, "Dhanush", "Nayanthara");
        Movie movie2 = new ThrillerMovie("Psycho", 2020, "Mysskin");

        System.out.println("Movie 1 Information:");
        movie1.displayInfo();
        System.out.println("Genre: " + movie1.getGenre());
        System.out.println("\nMovie 2 Information:");
        movie2.displayInfo();
        System.out.println("Genre: " + movie2.getGenre()); 
    }
}

