package edu.ticket;

public class InProgressState implements RequestState {

    public void Next(Ticket ticket){
        if ("BUG".equals(ticket.getType())) {
            System.out.println("Sending bug response");
        } else {
            System.out.println("Sending generic response");
        }
        ticket.setStatus(new ResolvedState());
    }
    public void PrintStatus(){
        System.out.println("Working on ticket");
    }
}
