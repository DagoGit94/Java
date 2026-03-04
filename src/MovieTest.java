
public class MovieTest {
    public static void main(String[] args) {
        // Create movies
        Movie movie1 = new Movie("Inception", "Christopher Nolan", 2010, 148, 8.8, "Sci-Fi");
        Movie movie2 = new Movie("The Godfather", "Francis Ford Coppola", 1972, 175, 9.2, "Drama");
        Movie movie3 = new Movie("Finding Nemo", "Andrew Stanton", 2003, 100, 8.1, "Animation");

        // Test 1: isLongMovie()
        System.out.println("=== Test 1: isLongMovie() ===");
        System.out.println("Is Inception long? " + movie1.isLongMovie());
        System.out.println("Is Finding Nemo long? " + movie3.isLongMovie());
        System.out.println();

        // Test 2: yearsSinceRelease()
        System.out.println("=== Test 2: yearsSinceRelease() ===");
        System.out.println("Years since Godfather released: " + movie2.yearsSinceRelease());
        System.out.println();

        // Test 3: printDetails()
        System.out.println("=== Test 3: printDetails() ===");
        movie3.printDetails();
        System.out.println();

        // Test 4: isClassic()
        System.out.println("=== Test 4: isClassic() ===");
        System.out.println("Is Godfather a classic? " + movie2.isClassic());
        System.out.println("Is Inception a classic? " + movie1.isClassic());
        System.out.println();

        // Test 5: isHighRated()
        System.out.println("=== Test 5: isHighRated() ===");
        System.out.println("Is Inception high-rated? " + movie1.isHighRated());
        System.out.println();

        // Test 6: updateRating()
        System.out.println("=== Test 6: updateRating() ===");
        System.out.println("Finding Nemo original rating: " + movie3.rate);

        movie3.updateRating(8.5);
        System.out.println("Finding Nemo new rating: " + movie3.rate);

        movie3.updateRating(11);
        System.out.println();

        // Test 7: getAgeCategory()
        System.out.println("=== Test 7: getAgeCategory() ===");
        System.out.println("Inception age category: " + movie1.getAgeCategory());
        System.out.println("Godfather age category: " + movie2.getAgeCategory());
        System.out.println("Finding Nemo age category: " + movie3.getAgeCategory());
        System.out.println();

        // Test 8: isSameGenre()
        System.out.println("=== Test 8: isSameGenre() ===");
        System.out.println("Inception and Finding Nemo same genre? " + movie1.isSameGenre(movie3));

        Movie movie4 = new Movie("Interstellar", "Christopher Nolan", 2014, 169, 8.6, "Sci-Fi");
        System.out.println("Inception and Interstellar same genre? " + movie1.isSameGenre(movie4));
        System.out.println();

        // Test 9: compareRating()
        System.out.println("=== Test 9: compareRating() ===");
        Movie better = movie1.CompareMovieRate(movie2);
        System.out.println("The better movie is: " + better.title);
        System.out.println();

        // Test 10: increaseDuration()
        System.out.println("=== Test 10: increaseDuration() ===");
        System.out.println("Inception original duration: " + movie1.duration + " minutes");

        movie1.increaseDuration(10);
        System.out.println("Inception new duration: " + movie1.duration + " minutes");

        movie1.increaseDuration(-5);
        System.out.println("Inception duration after error: " + movie1.duration + " minutes");
        System.out.println();

        // Test toString()
        System.out.println("=== Testing toString() ===");
        System.out.println("Movie 1: " + movie1.toString());
        System.out.println("Movie 2: " + movie2.toString());
        System.out.println("Movie 3: " + movie3.toString());
    }
}