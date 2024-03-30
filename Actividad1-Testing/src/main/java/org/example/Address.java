package org.example;

public class Address {
    private String street;
    public Address(String street){
        this.street = street;
    }
    //Assuming you night need a getter for tests or other operation
    public String getStreet(){
        return street;
    }

}
