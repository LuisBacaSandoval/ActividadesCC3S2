package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class ClientTest {
    // Crear dos direcciones para usar en las pruebas
    private Address address = new Address("street A");
    private Address secondAddress = new Address("street B");

    //SUT
    private Client client;

    // Método que se ejecuta antes de cada prueba para inicializar el estado
    @BeforeEach
    void setUp(){
        // Inicializar un nuevo cliente
        client = new Client();
    }

    // Prueba para verificar que después de la creación, el cliente no tiene ninguna dirección
    @Test
    void afterCreationShouldHaveNoAddress(){
        // Verificar que la lista de direcciones del cliente está vacía
        assertThat(client.getAddresses()).isEmpty();
    }

    // Prueba para verificar si se permite agregar una dirección al cliente
    @Test
    void shouldAllowToAddAddress(){
        // Agregar una dirección al cliente
        client.addAddress(address);

        // Verificar que la dirección se agregó correctamente
        assertThat(client.getAddresses()).containsExactly(address);
    }

    // Prueba para verificar si se permite agregar varias direcciones al cliente
    @Test
    void shouldAllowToAddManyAddresses(){
        // Agregar dos direcciones al cliente
        client.addAddress(address);
        client.addAddress(secondAddress);

        // Verificar que ambas direcciones se agregaron correctamente
        assertThat(client.getAddresses()).containsExactly(address, secondAddress);
    }
}