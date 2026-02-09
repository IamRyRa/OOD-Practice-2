package edu.ticket;

public class TicketService {
    
    public void handle(Ticket ticket) {
    
        while (!(ticket.getState() instanceof ClosedState)) {
            ticket.nextStep();
            System.out.println("Logging ticket handling : " + ticket.getId() + " -> " + ticket.getStatus());
        }
     
        ticket.nextStep();
    }
}