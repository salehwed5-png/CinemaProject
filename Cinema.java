package cinematickts;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
	  private List<Movie> movies;

	    public Cinema() {
	        movies = new ArrayList<>();
	    }

	    // Method to add a movie
	    public void addMovie(Movie movie) {
	        movies.add(movie);
	    }

	    // Method to display available movies
	    public void displayMovies() {
	        System.out.println("Available movies:");
	        for (int i = 0; i < movies.size(); i++) {
	            System.out.println((i + 1) + ". " + movies.get(i).getTitle());
	        }
	    }

	    // Method to get the movie name by index
	    public String getMovie(int index) {
	        if (index >= 0 && index < movies.size()) {
	            return movies.get(index).getTitle();
	        } else {
	            throw new IndexOutOfBoundsException("Invalid movie choice.");
	        }
	    }
	}