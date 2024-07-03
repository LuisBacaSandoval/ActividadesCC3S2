package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VientoTest {

    Viento viento;
    @Test
    public void testViento(){
        viento = new Viento(44);

        assertEquals(44,viento.getValor());
    }
    //test para verificar que el viento sea moderado, menor que 40 km/h
    @Test
    public void testVientoModerado(){
        viento = new Viento(35);

        boolean result = viento.esBaja();

        assertTrue(result);
    }
    //test para verificar que el viento sea fuerte, entre 40 y 90 km/h
    @Test
    public void testVientoFuerte(){
        viento = new Viento(50);

        boolean result = viento.esNormal();

        assertTrue(result);
    }
    //test para verificar que el viento sea huracanado, mayor que 90 km/h
    @Test
    public void testVientoHuracanado(){
        viento = new Viento(120);

        boolean result = viento.esAlta();

        assertTrue(result);
    }
}