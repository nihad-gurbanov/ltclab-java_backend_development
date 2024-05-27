package lesson23.MovieStream;

import java.util.*;

public class GenreExtractor {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("The Shawshank Redemption", "Drama"),
                new Movie("The Godfather", "Crime"),
                new Movie("The Dark Knight", "Action"),
                new Movie("Pulp Fiction", "Crime"),
                new Movie("Schindler's List", "Biography"),
                new Movie("Forrest Gump", "Drama"),
                new Movie("The Lord of the Rings", "Fantasy"),
                new Movie("Inception", "Action"),
                new Movie("The Matrix", "Action"),
                new Movie("Fight Club", "Drama")
        );

        Set<String> genereSet = new TreeSet<>();
        for (Movie movie: movies) {
            genereSet.add(movie.getGenre());
        }

        genereSet.forEach(System.out::println);
    }
}
