package org.example;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Client {
    // Variable privada que almacena una lista de direcciones
    private List<Address> addresses;

    // Constructor que inicializa una instancia de Client sin argumentos
    public Client(){
        // Inicializa la lista de direcciones como un nuevo ArrayList
        addresses = new ArrayList<>();
    }

    // Método para añadir una dirección a la lista de direcciones del cliente
    public void addAddress(Address address){
        addresses.add(address);
    }

    // Método que puede ser útil para las aserciones de prueba
    // Devuelve la lista de direcciones del cliente
    public List<Address> getAddresses(){
        return addresses;
    }
}

