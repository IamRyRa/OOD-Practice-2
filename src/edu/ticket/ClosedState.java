package edu.ticket;

public class ClosedState implements RequestState {

    public void Next(Ticket ticket){
        
    }
    public void PrintStatus(){
        System.out.println("Ticket closed");
    }
}
