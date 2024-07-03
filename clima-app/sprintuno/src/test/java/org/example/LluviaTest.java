package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LluviaTest {

    Lluvia lluvia;
    @Test
    public void testLluvia() {
        lluvia = new Lluvia(50);

        assertEquals(50, lluvia.getValor());
    }
    //test para verificar que la lluvia sea llovizna, entre 20 y 50 mm
    @Test
    public void testLluviaLlovizna() {
        lluvia = new Lluvia(30);

        boolean result = lluvia.esBaja();

        assertTrue(result);
    }
    //test para verificar que la lluvia sea intensa, entre 50 y 100 mm
    @Test
    public void testLluviaIntensa() {
        lluvia = new Lluvia(80);

        boolean result = lluvia.esNormal();

        assertTrue(result);
    }
    //test para verificar que la lluvia sea muy intensa, mayor a 100 mm
    @Test
    public void testLluviaMuyIntensa() {
        lluvia = new Lluvia(150);

        boolean result = lluvia.esAlta();

        assertTrue(result);
    }
}