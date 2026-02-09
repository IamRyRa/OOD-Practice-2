package edu.ticket;

public class ResolvedState implements RequestState {
    @Override
    public void Next(Ticket ticket){   
        System.out.println("Ticket resolved");
        ticket.setStatus(new ClosedState()) ;
    }
}