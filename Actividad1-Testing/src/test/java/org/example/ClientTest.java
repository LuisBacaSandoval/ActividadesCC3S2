package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClientTest {
    private Address address = new Address("street A");
    private Address secondAddress = new Address("street B");
    private Client client;
    
    @BeforeEach
    void setUp(){
        client = new Client();
        //client.setSomePropertiesIfNeeded();
    }
    
    @Test
    void afterCreationShouldHaveNoAddress(){
        // Verificar que la lista de direcciones esté vacía después de crear el objeto Client
        assertTrue(client.getAddresses().isEmpty());
    }
    
    @Test
    void shouldAllowToAddAddress(){
        // Agregar una dirección al cliente
        client.addAddress(address);
        
        // Verificar que el cliente tenga la dirección agregada
        assertEquals(address, client.getAddresses().get(0));
    }
    
    @Test
    void shouldAllowToAddManyAddresses(){
        // Agregar las dos direcciones al objeto client utilizando el método addAddress
        client.addAddress(address);
        client.addAddress(secondAddress);

        // Verificar que las direcciones se hayan agregado correctamente utilizando el método getAddresses
        // El método assertTrue se utiliza para verificar que la lista devuelta por getAddresses contenga tanto address como secondAddress
        assertTrue(client.getAddresses().contains(address));
        assertTrue(client.getAddresses().contains(secondAddress));
    }
}
