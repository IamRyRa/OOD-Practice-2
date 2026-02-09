package edu.ticket;

public class TicketService {
    
    public void handle(Ticket ticket) {

        ticket.nextStep();
        System.out.println("Logging ticket handling : " + ticket.getId() + " -> " + ticket.getStatus());
    }
}
