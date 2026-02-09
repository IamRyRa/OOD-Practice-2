package edu.ticket;

public class BugResponseStrategy implements ResponseStrategy {
    @Override
    public void executeResponse(Ticket ticket) {
        System.out.println("Sending bug response");
        ticket.setResponse("Fix deployed in version 1.2");
    }
}