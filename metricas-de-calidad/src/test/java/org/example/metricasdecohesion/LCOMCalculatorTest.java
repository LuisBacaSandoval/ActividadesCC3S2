package org.example.metricasdecohesion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class LCOMCalculatorTest {
    LCOMCalculator.ClassInfo classInfo;
    @BeforeEach
    void setUp() {
        classInfo = new LCOMCalculator.ClassInfo();
    }

    @Test
    @DisplayName("Test de LCOM con alta cohesion lcom<0")
    public void testLCOMHighCohesion(){
        classInfo.addMethod("method1", new HashSet<>(Arrays.asList("attr1", "attr2")));
        classInfo.addMethod("method2", new HashSet<>(Arrays.asList("attr2", "attr3")));
        classInfo.addMethod("method3", new HashSet<>(Arrays.asList("attr1", "attr3")));

        int lcom = LCOMCalculator.calculateLCOM(classInfo);

        assertTrue(lcom<0, "LCOM debe indicar alta cohesión (valor negativo)");
    }

    @Test
    @DisplayName("Test LCOM con baja cohesion lcom>0")
    public void testLCOMLowCohesion(){
        classInfo.addMethod("method1", new HashSet<>(Arrays.asList("attr1", "attr2")));
        classInfo.addMethod("method2", new HashSet<>(Arrays.asList("attr3")));
        classInfo.addMethod("method3", new HashSet<>(Arrays.asList("attr4", "attr5")));

        int lcom = LCOMCalculator.calculateLCOM(classInfo);

        assertTrue(lcom>0, "LCOM debe indicar baja cohesión (valor positivo)");
    }

    @Test
    @DisplayName("Test LCOM sin metodos lcom=0")
    public void testLCOMNoMethods(){
        int lcom = LCOMCalculator.calculateLCOM(classInfo);

        assertEquals(0, lcom, "LCOM debe ser 0 cuando no hay métodos");
    }

    @Test
    @DisplayName("Test LCOM con un solo metodo lcom=0")
    public void testLCOMSingleMethod() {
        classInfo.addMethod("method1", new HashSet<>(Arrays.asList("attr1", "attr2")));

        int lcom = LCOMCalculator.calculateLCOM(classInfo);

        assertEquals(0, lcom, "LCOM debe ser 0 cuando solo hay un método");
    }

    @Test
    @DisplayName("Test LCOM cuando se pasa valores nulos o vacios")
    public void testInvalidMethodAddition(){
        assertThrows(IllegalArgumentException.class, () ->{
            classInfo.addMethod(null, new HashSet<>(Arrays.asList("attr1", "attr2")));
        }, "El metodo no puede ser nulo");

        assertThrows(IllegalArgumentException.class, () ->{
            classInfo.addMethod("method1", null);
        }, "Los atributos no pueden ser nulo");

        assertThrows(IllegalArgumentException.class, () -> {
            classInfo.addMethod("method1", new HashSet<>());
        }, "Se deben pasar atributos");
    }

}