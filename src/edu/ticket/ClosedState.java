package edu.ticket;

public class ClosedState implements RequestState {
    @Override
    public void Next(Ticket ticket){
        System.out.println("Ticket closed");
    }

    @Override
    public void PrintState(){
        System.out.println("Ticket closed");
    }
}