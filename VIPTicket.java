package cinematickts;
public class VIPTicket extends Ticket {  
    // Constructor
    public VIPTicket(String movieName) {
        super(movieName, "VIP");
        calculatePrice();
    }

    // Overriding the calculatePrice method for VIP ticket
    @Override
    public void calculatePrice() {
        this.price = 15.0; // VIP ticket price
    }
}