package cinematickts;
public abstract class Ticket {
	 protected String movieName;
	    protected double price;
	    protected String ticketType;

	    // Constructor
	    public Ticket(String movieName, String ticketType) {
	        this.movieName = movieName;
	        this.ticketType = ticketType;
	    }

	    // Abstract method for calculating price
	    public abstract void calculatePrice();

	    // Method to display ticket information
	    public void displayTicketInfo() {
	        System.out.println("Ticket Information:");
	        System.out.println("Movie: " + movieName);
	        System.out.println("Ticket Type: " + ticketType);
	        System.out.println("Price: $" + price);
	    }
	}