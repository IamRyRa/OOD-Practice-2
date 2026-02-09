package edu.ticket;

public class WebChannelStrategy implements ChannelStrategy {
    @Override
    public void processChannel() {
        System.out.println("Received from web");
    }
}