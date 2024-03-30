package org.example;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private List<Address> addresses;
    public Client(){
        addresses = new ArrayList<>();
    }
    public void addAddress(Address address){
        addresses.add(address);
    }
    //This method night be necessary for yout test assertions
    public List<Address> getAddresses(){
        return addresses;
    }
}
