package cinematickts;
import java.util.Scanner;

public class Customer {  
	  private String name;

	    // Constructor
	    public Customer(String name) {
	        this.name = name;
	    }

	    // Method to book a ticket
	    public Ticket bookTicket(Cinema cinema) {
	        Scanner scanner = new Scanner(System.in);

	        // Display available movies
	        cinema.displayMovies();

	        System.out.print("Enter the number of the movie you want to book: ");
	        int movieChoice = scanner.nextInt();
	        scanner.nextLine(); // Consume newline

	        // Get the selected movie name
	        String movieName = cinema.getMovie(movieChoice - 1);

	        // Ask if the customer wants a VIP ticket
	        System.out.print("Do you want a VIP ticket? (yes/no): ");
	        String vipChoice = scanner.nextLine().toLowerCase();

	        // Create a Ticket object based on the VIP choice
	        Ticket ticket;
	        if (vipChoice.equals("yes")) {
	            ticket = new VIPTicket(movieName);
	        } else {
	            ticket = new RegularTicket(movieName);
	        }

	        return ticket;
	    }
	}