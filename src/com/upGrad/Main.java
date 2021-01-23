package com.upGrad;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Address a= new Address("town high school street","Rajahmundry","A.P");
        System.out.println(a.getAddressDetails());
        a.updateAddressDetails("kambalacheruvu@Rajahmundry@A.P");
        System.out.println(a.getAddressDetails());
        a.updateAddressDetails("Nehru Nagar","Rajahmundry","A.P");
        System.out.println(a.getAddressDetails());

        Contact c = new Contact("Ram","7036319862","ramakrishna060997@gmail.com");
        System.out.println(c.getContactDetails());
        c.setContactDetails("apsarma@7382913136@apsarma68@gmail.com");
        System.out.println(c.getContactDetails());
        c.setContactDetails("sai kumari","6304596540","ask@gmail.com");
        System.out.println(c.getContactDetails());

        Flight f = new Flight(87,"Air India",300,3);
        System.out.println(f.getFlightDetails());
        System.out.println(f.checkAvailability());
        f.updateBookedSeats(300);
        System.out.println(f.checkAvailability());

        Passenger p = new Passenger(1,"Ramakrishna","7036319862",
                "ramakrishna060997@gmail.com","chakali street", "Rajahmundry","AP");
        System.out.println(p.getAddress().getAddressDetails());
        System.out.println(p.getContact().getContactDetails());
        System.out.println(p.getId());

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
                departureTime,arrivalTime,p,213,6000,false,a,touristLocations);
        System.out.println(tt.checkStatusCancelled());
        System.out.println(tt.getFlightDuration());
        tt.setStatusCancelled();
        System.out.println(tt.checkStatusCancelled());
        System.out.println(tt.getHotelAddress().getAddressDetails());
        for (String s: tt.touristLocations){
            System.out.println(s);
        }




    }
}


