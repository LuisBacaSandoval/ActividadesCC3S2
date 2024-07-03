package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperaturaTest {

    Temperatura temperatura;
    @Test
    public void testTemperatura(){
        temperatura = new Temperatura(24);

        assertEquals(24, temperatura.getValor());
    }
    //test para verificar que la temperatura sea baja, menos que 5
    @Test
    public void testTemperaturaBaja(){
        temperatura = new Temperatura(3);

        boolean result = temperatura.esBaja();

        assertTrue(result, "Se espera que la temperatura sea baja.");
    }
    //test para verificar que la temperatura sea normal, entre 5 y 30
    @Test
    public void testTemperaturaNormal(){
        temperatura = new Temperatura(25);

        boolean result = temperatura.esNormal();

        assertTrue(result, "Se espera que la temperatura sea normal.");
    }
    //test para verificar que la temperatura sea alta, mayor 30
    @Test
    public void testTemperaturaAlta(){
        temperatura = new Temperatura(32);

        boolean result = temperatura.esAlta();

        assertTrue(result, "Se espera que la temperatura sea alta.");
    }
    //test para verificar que la temperatura sea baja para valores negativos
    @Test
    public void testTemperaturaBajaNegativa(){
        temperatura = new Temperatura(-1);

        boolean result = temperatura.esBaja();

        assertTrue(result, "Se espera que la temperatura sea baja.");
    }

}