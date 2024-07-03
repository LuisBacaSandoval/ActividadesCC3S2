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
    //test que abarcan los limites de cada método
    @Test
    public void testVientoModeradoLimiteSuperior() {
        Viento viento = new Viento(40);
        assertTrue(viento.esBaja(), "40 km/h aún se considera moderado.");
    }

    @Test
    public void testVientoFuerteLimiteInferior() {
        Viento viento = new Viento(41);
        assertTrue(viento.esNormal(), "41 km/h se considera fuerte (limite inferior).");
    }

    @Test
    public void testVientoFuerteLimiteSuperior() {
        Viento viento = new Viento(89);
        assertTrue(viento.esNormal(), "89 km/h se considera fuerte (limite superior).");
    }

    @Test
    public void testVientoHuracanadoLimiteInferior() {
        Viento viento = new Viento(90);
        assertTrue(viento.esAlta(), "90 km/h se considera huracanado (limite inferior).");
    }

    @Test
    public void testVientoNoModerado() {
        Viento viento = new Viento(41);
        assertFalse(viento.esBaja(), "41 km/h no se considera moderado.");
    }

    @Test
    public void testVientoNoFuerte() {
        Viento viento = new Viento(90);
        assertFalse(viento.esNormal(), "90 km/h no se considera fuerte.");
    }

    @Test
    public void testVientoNoHuracanado() {
        Viento viento = new Viento(89);
        assertFalse(viento.esAlta(), "89 km/h no se considera huracanado.");
    }
}