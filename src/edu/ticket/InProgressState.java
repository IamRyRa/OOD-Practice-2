package edu.ticket;

public class InProgressState implements RequestState {
    @Override
    public void Next(Ticket ticket){
        System.out.println("Working on ticket");
        ticket.getResponseStrategy().executeResponse(ticket);
        ticket.setStatus(new ResolvedState());
    }

    @Override
    public void PrintState(){
        System.out.println("Working on ticket");
    }
}
  
