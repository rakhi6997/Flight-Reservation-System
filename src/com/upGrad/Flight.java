package com.upGrad;

public class Flight {
    public int flightNumber;
    public String airline;
    public int totalCapacity;
    private int bookedSeats;

    public Flight(int flightNumber,String airline,int totalCapacity,int bookedSeats){
        this.flightNumber=flightNumber;
        this.airline=airline;
        this.totalCapacity=totalCapacity;
        this.bookedSeats=bookedSeats;
    }
    public  String getFlightDetails(){
        return flightNumber +"@"+ airline + "@" + bookedSeats;
    }
    public boolean checkAvailability(){
        if(totalCapacity>bookedSeats){
            return true;
        } else {
            return false;
        }

    }
    public  void updateBookedSeats(int seatsNeeded){
        bookedSeats=bookedSeats+seatsNeeded;
    }
}
