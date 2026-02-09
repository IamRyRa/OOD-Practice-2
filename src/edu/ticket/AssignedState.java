package edu.ticket;

public class AssignedState implements RequestState {

    public void Next(Ticket ticket){
        if ("BUG".equals(ticket.getType())) {
            System.out.println("Assigned to engineering");
        } else {
            System.out.println("Assigned to support");
        }
        ticket.setStatus(new InProgressState());
    }

    public void PrintStatus(){
    }
}
