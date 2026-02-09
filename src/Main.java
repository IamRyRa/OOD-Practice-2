import edu.ticket.Ticket;
import edu.ticket.TicketService;

public class Main {

    public static void main(String[] args) {
        TicketService ticketService = new TicketService();
        TicketFactory factory = new WebTicketFactory();
        Ticket ticket = factory.createTicket(1, "BUG");
        ticket.setRequest("I see a very very BAD BUG!");
        
        ticketService.handle(ticket);
    }
}
