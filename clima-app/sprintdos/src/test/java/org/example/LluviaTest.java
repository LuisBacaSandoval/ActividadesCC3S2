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
    //test para verificar que la lluvia no es llovizna
    @Test
    public void testLluviaNoLlovizna() {
        Lluvia lluvia = new Lluvia(10);
        assertFalse(lluvia.esBaja());
    }
    //test para verificar que la lluvia no es intensa
    @Test
    public void testLluviaNoIntensa() {
        Lluvia lluvia = new Lluvia(101);
        assertFalse(lluvia.esNormal());
    }
    //test para verificar que la lluvia no es Muy intensa
    @Test
    public void testLluviaNoMuyIntensa() {
        Lluvia lluvia = new Lluvia(50);
        assertFalse(lluvia.esAlta());
    }
    //test de rangos limites
    @Test
    public void testLluviaLloviznaLimiteInferior() {
        Lluvia lluvia = new Lluvia(20);
        assertFalse(lluvia.esBaja());
    }

    @Test
    public void testLluviaLloviznaLimiteSuperior() {
        Lluvia lluvia = new Lluvia(50);
        assertTrue(lluvia.esBaja());
    }

    @Test
    public void testLluviaIntensaLimiteInferior() {
        Lluvia lluvia = new Lluvia(50);
        assertFalse(lluvia.esNormal());
    }

    @Test
    public void testLluviaIntensaLimiteSuperior() {
        Lluvia lluvia = new Lluvia(100);
        assertTrue(lluvia.esNormal());
    }

    @Test
    public void testLluviaMuyIntensaLimiteInferior() {
        Lluvia lluvia = new Lluvia(100);
        assertFalse(lluvia.esAlta());
    }
}