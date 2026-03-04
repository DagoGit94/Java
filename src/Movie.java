
public class Movie {

    // Class fields
    String title;
    private String director;
    private int releaseYear;
    int duration;
    double rate;
    private String genre;

    private static int totalMovies = 0;
    // Class constructor

    public Movie (String title, String director, int releaseYear, int duration, double rate, String genre){
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.duration = duration;
        this.rate = rate;
        this.genre = genre;
    }

    // Class methods

    public boolean isLongMovie(){   // Check is the movie is long
        return duration > 150;
    }
    public int yearsSinceRelease(){   // Check age of the movie
        return 2026-releaseYear;
    }

    public void printDetails(){  // Display the summary
        System.out.println("===Movie details===");
        System.out.println("Title : "+title);
        System.out.println("Director : "+director);
        System.out.println("Rating : "+rate);
    }
    public boolean isClassic(){   // Check is movie older than 25 years
        return yearsSinceRelease() > 25;
    }
    boolean isHighRated(){
        return rate >= 8.0;
    }
    public void updateRating(double newRating) {
        if (newRating >= 0 && newRating <= 10) {
            this.rate = newRating;
            System.out.println(" Rating updated to: " + rate);
        } else {
            System.out.println(" Error: Rating must be between 0 and 10");
        }
    }


   public String getAgeCategory(){
        int age = yearsSinceRelease();
        if (age < 5){
            return "New Release";
        }
        else if (age <= 15 ){
            return"Modern Classic";
        }
        else if (age <= 30){
            return "Classic";
        }
        else {
            return "Vintage";
        }

    }
    public boolean isSameGenre(Movie otherMovie){
        return this.genre.equals(otherMovie.genre);
    }

    public Movie CompareMovieRate(Movie otherMovie){
        if (this.rate > otherMovie.rate) {
            return this;
        } else if (otherMovie.rate > this.rate) {
            return otherMovie;
        } else {
            System.out.println("Both movies have the same rating!");
            return this;  // Return either one
        }

    }

    public void increaseDuration (int minutes) {
        if (minutes > 0){
            this.duration +=minutes;
            System.out.println("Duration increased to " + duration + "minutes");
        } else {
            System.out.println("Error : Minutes must be positive");
        }


    }

    @Override
    public String toString(){
        return " The movie "+title+ " directed by "+director+ " in "+releaseYear+"last "+duration+". "
                +"It is rated at "+rate+ "and is classified as a "+genre+ "movie.";
    }
}

