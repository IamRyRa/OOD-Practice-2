package edu.ticket;

public class BugResponseStrategy implements ResponseStrategy {
    @Override
    public void describeAssignment() { System.out.println("Assigned to engineering"); }
    @Override
    public void executeResponse(Ticket ticket) {
        System.out.println("Sending bug response");
        ticket.setResponse("Fix deployed");
    }
}