package edu.ticket;

public class Ticket {
    int id;
    private RequestState state;
    String channel;
    String type;
    String request;
    String response;
    private ChannelStrategy channelStrategy;
    private ResponseStrategy responseStrategy;

    public Ticket(int id, String channel, String type) {
        this.id = id;
        this.channel = channel;
        this.type = type;
        this.state = new CreatedState();
    }

    public void nextStep() {
        state.Next(this);
    }

    public void setChannelStrategy(ChannelStrategy cs) { 
        this.channelStrategy = cs; }
    public ChannelStrategy getChannelStrategy() {
         return channelStrategy; }
    
    public void setResponseStrategy(ResponseStrategy rs) { 
        this.responseStrategy = rs; }
    public ResponseStrategy getResponseStrategy() {
         return responseStrategy; }

    public void setStatus(RequestState state) { 
        this.state = state; }
    public RequestState getState() {
         return state; }
    public String getStatus() { 
        return state.getClass().getSimpleName(); }
    public String getChannel() {
         return channel;
          }
    public String getType() { 
        return type; 
        }
    public int getId() {
         return id; }
    public void setResponse(String response) { 
        this.response = response; }
    public void setRequest(String request) {
         this.request = request; }
}