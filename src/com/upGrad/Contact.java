package com.upGrad;

public class Contact {
    public String name;
    public String phone;
    public String email;
    public Contact(String name,String phone,String email){
        this.name=name;
        this.phone=phone;
        this.email=email;
    }
    public String getContactDetails(){
        return name + "@" + phone  + "@"+ email;
    }
    public void setContactDetails(String contact){
        String[] contactArray = contact.split("@",3);
        name =  contactArray[0];
        phone = contactArray[1];
        email = contactArray[2];
    }
    public void setContactDetails(String name,String phone,String email){
        this.name=name;
        this.phone=phone;
        this.email=email;
    }
}
