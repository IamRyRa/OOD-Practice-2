package edu.ticket;

public class WebTicketFactory extends TicketFactory {
    @Override
    public Ticket createTicket(int id, String type) {
        Ticket t = new Ticket(id, "WEB", type);
        t.setChannelStrategy(new WebChannelStrategy());
        if ("BUG".equalsIgnoreCase(type)) {
            t.setResponseStrategy(new BugResponseStrategy());
        } else {
            t.setResponseStrategy(new GenericResponseStrategy());
        }
        return t;
    }
}