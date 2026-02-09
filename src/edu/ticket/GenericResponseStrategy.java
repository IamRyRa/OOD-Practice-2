package edu.ticket;

public class GenericResponseStrategy implements ResponseStrategy {
    @Override
    public void describeAssignment() { System.out.println("Assigned to support"); }
    @Override
    public void executeResponse(Ticket ticket) {
        System.out.println("Sending generic response");
        ticket.setResponse("Our support team will contact you.");
    }
}