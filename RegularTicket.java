package cinematickts;
public class RegularTicket extends Ticket {
    // Constructor
    public RegularTicket(String movieName) {
        super(movieName, "Regular");
        calculatePrice();
    }

    // Overriding the calculatePrice method for Regular ticket
    @Override
    public void calculatePrice() {
        this.price = 10.0; // Regular ticket price
    }
}