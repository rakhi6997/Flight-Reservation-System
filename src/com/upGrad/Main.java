package com.upGrad;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Flight f = new Flight(87,"Air India",300,3);
        System.out.println(f.getFlightDetails());
        System.out.println(f.checkAvailability());
        f.updateSeatsBooked(297);
        System.out.println(f.checkAvailability());

        Passenger p = new Passenger("Ramakrishna","7036319862",
                "ramakrishna060997@gmail.com","chakali street", "Rajahmundry","AP");
        System.out.println("Address: "+p.getAddress());
        System.out.println("Contact: "+p.getContact());
        System.out.println("Id: "+p.getId());
        System.out.println(Passenger.getIdCounter());
        System.out.println(Passenger.getPassengerCount());
        p.setAddress("Nehru Nagar","Rajahmundry","A.P" );
        p.setContact("Apsarma","7382913136","apsarma68@gmail.com");

        Passenger p1 = new Passenger("Sai kumari","6304596540",
                "ask@gmail.com","chakali street", "Rajahmundry","AP");
        System.out.println(p1.getAddress());
        System.out.println(p1.getContact());
        System.out.println(p1.getId());
        System.out.println(Passenger.getIdCounter());
        System.out.println(Passenger.getPassengerCount());


        String arrivalTime = "21/01/01 23:23:34";
        String departureTime ="20/12/31 5:23:32";

        RegularTicket rt = new RegularTicket("13232","Bangalore",
                "Rajahmundry",f,
                departureTime,arrivalTime,p,213,6000,false,null);
        System.out.println(rt.checkStatusCancelled());
        System.out.println(rt.getFlightDuration());
        rt.setStatusCancelled();
        System.out.println(rt.checkStatusCancelled());
        System.out.println(rt.getSpecialService());
        rt.updateSpecialService(null);

        String[] touristLocations = {"shimla","manali","ooty"};
        TouristTicket tt = new TouristTicket("13232","Bangalore",
                "Rajahmundry",f,
                departureTime,arrivalTime,p,213,6000,false,
                "",touristLocations);
        System.out.println(tt.checkStatusCancelled());
        System.out.println(tt.getFlightDuration());
        tt.setStatusCancelled();
        System.out.println(tt.checkStatusCancelled());
        System.out.println(tt.getHotelAddress());
        for (String s: tt.touristLocations){
            System.out.println(s);
        }

    }
    
}
