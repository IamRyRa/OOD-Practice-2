package edu.ticket;

public abstract class TicketFactory {
    public abstract Ticket createTicket(int id, String type);
}