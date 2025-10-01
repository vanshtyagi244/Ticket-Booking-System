package ticket.booking.entities;

import java.util.Date;

public class Ticket {
    private String ticketId;
    private String userId;
    private String source;
    private String destination;
    private Date dateOfTravel;
    private Train train;

    //getters
    public String getTicketId(){
        return ticketId;
    }

    public String getUserId(){
        return userId;
    }

    public String getSource(){
        return source;
    }

    public String getDestination(){
        return destination;
    }

    public Date getDateOfTravel(){
        return dateOfTravel;
    }

    public Train getTrain(){
        return train;
    }

    //setters

}
