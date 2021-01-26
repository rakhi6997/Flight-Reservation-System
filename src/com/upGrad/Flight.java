package com.upGrad;

public class Flight {

    private int flight;
    private String airline;
    private int totalCapacity;
    private int seatsBooked;

    public Flight(int flight,String airline,int totalCapacity,int seatsBooked) {
        
        this.flight = flight;
        this.airline=airline;
        this.totalCapacity=totalCapacity;
        this.seatsBooked=seatsBooked;
    }
    public String getFlightDetails(){
        return flight +" @ " + airline + " @ " +seatsBooked;
    }
    public boolean checkAvailability(){
        if(totalCapacity>=seatsBooked){
            return true;
        }
        else{
            return false;
        }

    }
    public void updateBookedSeats(int seatsNeeded){
        seatsBooked=seatsBooked+seatsNeeded;
    }



}
