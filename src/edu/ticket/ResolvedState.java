package edu.ticket;

public class ResolvedState implements RequestState {

    public void Next(Ticket ticket){   
        ticket.setStatus(new ClosedState()) ;
    }
    public void PrintState(){
        System.out.println("Ticket resolved");
    }
}
