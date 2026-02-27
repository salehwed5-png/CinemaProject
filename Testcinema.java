package TestCinema;
import cinematickts .*;
import java.util.Scanner;

public class Testcinema {
    public static void main(String[] args) {
        // Create a new Cinema object
        Cinema cinema = new Cinema();

        //Add some sample movies to the cinema
        cinema.addMovie(new Movie("Avatar", 10.0));  //Add a movie to the cinema
        cinema.addMovie(new Movie("Inception", 14.0));  //Add another Movie
        cinema.addMovie(new Movie("Spider-Man: Homecoming", 12.0));
        cinema.addMovie(new Movie("Avengers: Infinity War ", 10.0)); 
        cinema.addMovie(new Movie("The Dark Knight", 13.0));

        System.out.println("Welcome to Cinema Ticket Booking System!");

        // Ask for customer name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String customerName = scanner.nextLine();

        // Create a new Customer object
        Customer customer = new Customer(customerName);

        // Book a ticket for the customer
        Ticket ticket = customer.bookTicket(cinema);

        // Display the ticket information
        System.out.println("\nThank you for booking! Here are your ticket details:");
        ticket.displayTicketInfo();

        scanner.close();
    }
}