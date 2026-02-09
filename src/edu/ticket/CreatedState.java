package edu.ticket;

public class CreatedState implements RequestState {

    public void Next(Ticket ticket){
        if ("WEB".equals(ticket.getChannel())) {
            System.out.println("Received from web");
        } else if ("EMAIL".equals(ticket.getChannel())) {
            System.out.println("Received from email");
        }
        ticket.setStatus(new AssignedState());
    }

    public void PrintStatus(){
        System.out.println("Ticket created");
    }
}
