package com.upGrad;

public class Passenger {
    private int id;
    private Contact contact;
    private Address address;
    private static  int idCounter;

    private static class Address {
        private String street;
        private String city;
        private String state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
        public String getAddressDetails() {
            return street + "@" + city + "@" + state;
        }
        public void updateAddressDetails(String address) {
            String[] arrayAddress = address.split("@",3);
            this.street = arrayAddress[0];
            this.city = arrayAddress[1];
            this.state = arrayAddress[2];
        }
        public void updateAddressDetails(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }

    private static class Contact {
        private String name;
        private String phone;
        private String email;
        public Contact(String name,String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }

        public  String getContactDetails() {
            return name + "@" + phone + "@" +email;
        }
        public void setContactDetails(String contactDetails) {
            String[] contactArray = contactDetails.split("@",3);
            name = contactArray[0];
            phone = contactArray[1];
            email = contactArray[2];
        }
        public  void  setContactDetails(String name,String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }

    }

    public  Passenger(String name,String phone, String email,String street, String city, String state ){
        Contact contact = new Contact(name, phone, email);
        this.contact = contact;
        Address address = new Address(street, city, state);
        this.address = address;
        this.idCounter++;
        this.id = idCounter;
    }
    public int getId() {
        return  id;
    }
    public String getContact() {
        return contact.getContactDetails();
    }
    public void setContact(String name,String phone, String email) {
        this.contact.setContactDetails(name,phone,email);
    }

    public String getAddress() {
        return  address.getAddressDetails();
    }
    public void setAddress(String street, String city, String state ) {
        this.address.updateAddressDetails(street,city,state);
    }
    public static  int getIdCounter() {
        return idCounter;
    }
    public static int getPassengerCount() {
        return idCounter;
    }

}
