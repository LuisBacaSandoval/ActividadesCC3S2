package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

/**
 * Clase de prueba para probar el comportamiento del constructor de la clase Money en situaciones de excepción.
 */
public class MoneyIAETest {

    // Definición de la moneda válida para las pruebas
    private final static String VALID_CURRENCY = "USD";

    /**
     * Método de prueba parametrizado que verifica si el constructor de la clase Money
     * lanza una excepción IllegalArgumentException
     * cuando se proporciona un monto inválido.
     */
    @ParameterizedTest
    @ValueSource(ints = {-12387, -5, -1})
    void constructorShouldThrowIAEForInvalidAmount(int invalidAmount){
        // Utilizando AssertJ para verificar que se lance una excepción de tipo IllegalArgumentException
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(()->{
                    // Creación de una nueva instancia de Money con el monto inválido y la moneda válida
                    new Money(invalidAmount, VALID_CURRENCY);
                });
    }
}
