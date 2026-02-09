package edu.ticket;

public class EmailTicketFactory extends TicketFactory {
    @Override
    public Ticket createTicket(int id, String type) {
        Ticket t = new Ticket(id, "EMAIL", type);
        t.setChannelStrategy(new EmailChannelStrategy());
        return t;
    }
}