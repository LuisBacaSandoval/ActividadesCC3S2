package org.example;

public class Address {
    // Variable privada que almacena la calle de la dirección
    private String street;

    // Constructor que inicializa una instancia de Address con una calle
    public Address(String street){
        // Asigna la calle proporcionada al atributo de la dirección
        this.street = street;
    }

    // Método que puede ser útil para las aserciones de prueba u otras operaciones
    // Devuelve la calle de la dirección
    public String getStreet(){
        return street;
    }
}

