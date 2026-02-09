package edu.ticket;

public class CreatedState implements RequestState {
    @Override
    public void Next(Ticket ticket){
        System.out.println("Ticket created");
        ticket.getChannelStrategy().processChannel();
        ticket.setStatus(new AssignedState());
    }
}