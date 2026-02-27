package cinematickts;
public class Movie {
	  private String title;
	    private double price;

	    // Constructor
	    public Movie(String title, double price) {
	        this.title = title;
	        this.price = price;
	    }

	    // Getters
	    public String getTitle() {
	        return title;
	    }

	    public double getPrice() {
	        return price;
	    }
	}