package com.upGrad;

public class Address {
    public String Street;
    public String City;
    public String State;

    public Address(String Street,String City,String State){
        this.Street=Street;
        this.City=City;
        this.State=State;
    }
    public String getAddressDetails(){
        return Street + "@" +City +"@" + State;
    }
    public void updateAddressDetails(String address){
        String [] arrayAddress =address.split("@",3);
        this.Street =arrayAddress[0];
        this.City=arrayAddress[1];
        this.State=arrayAddress[2];
    }
    public void updateAddressDetails(String Street,String City,String State){
        this.Street=Street;
        this.City=City;
        this.State=State;
    }
}
