package edu.ticket;

public class EmailChannelStrategy implements ChannelStrategy {
    @Override
    public void processChannel() {
        System.out.println("Received from email");
    }
}