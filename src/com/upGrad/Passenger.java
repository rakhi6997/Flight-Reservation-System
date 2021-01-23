package com.upGrad;

public class Passenger {
    public int id;
    public Address address;
    public Contact contact;

    public Passenger(int id,String name,String phone,String email,String Street,String City,String State){

        this.id=id;
        Address address =new Address(Street,City,State);
        this.address=address;
        Contact contact=new Contact(name,phone,email);
        this.contact=contact;


    }
    public int getId(){
        return id;
    }
    public Address getAddress(){
        return address;
    }
    public Contact getContact(){
        return contact;
    }
}
