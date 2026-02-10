package edu.ticket;

public class AssignedState implements RequestState {
    @Override
    public void Next(Ticket ticket){
        ticket.getResponseStrategy().describeAssignment();
        ticket.setStatus(new InProgressState());
    }

    @Override
    public void PrintState(){
    }
}