package com.upGrad;

public class Passenger {
    private int id;
    private Contact contact;
    private Address address;
    public static  int idCounter;

    private static class Address {
        private String Street;
        private String City;
        private String State;

        public Address(String Street, String City, String State) {
            this.Street = Street;
            this.City = City;
            this.State = State;
        }

        public String getAddressDetails() {
            return Street + " @ " + City + " @ " + State;
        }

        public void updateAddressDetails(String address) {
            String[] arrayAddress = address.split(" @ ", 3);
            Street = arrayAddress[0];
            City = arrayAddress[1];
            State = arrayAddress[2];
        }

        public void updateAddressDetails(String Street, String City, String State) {
            this.Street = Street;
            this.City = City;
            this.State = State;
        }
    }
    public  static class Contact{
        private String name;
        private String phone;
        private String email;

        public Contact(String name,String phone,String email){
            this.name=name;
            this.phone=phone;
            this.email=email;
        }
        public String getContactDetails(){
            return name + " @ " + phone + " @ " + email;
        }
        public void setContactDetails(String contact){
            String[] arrayContact =contact.split(" @ ",3);
            name=arrayContact[0];
            phone=arrayContact[1];
            email=arrayContact[2];
        }
        public void setContactDetails(String name,String phone,String email){
            this.name=name;
            this.phone=phone;
            this.email=email;
        }
    }

    public Passenger(String name,String phone,String email,String Street,String City,String State){
        Contact contact =new Contact(name,phone,email);
        this.contact=contact;
        Address address=new Address(Street,City,State);
        this.address=address;
        this.idCounter++;
        this.id=idCounter;
    }
    public  int getId(){
        return id;
    }
    public String getContact(){
        return this.contact.getContactDetails();

    }
    public void setContact(String name,String phone,String email){
        this.contact.setContactDetails(name, phone, email);
    }
    public String getAddress(){
        return this.address.getAddressDetails();
    }
    public void setAddress(String Street,String City,String State){
        this.address.updateAddressDetails(Street,City,State);
    }
    public static int getIdCounter(){
        return idCounter;
    }
    public static int getPassengerCount(){
        return idCounter;
    }

}
