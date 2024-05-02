package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.Assertions.assertThat;

public class MoneyIAETest {
    private final static String VALID_CURRENCY = "USD"; // Constante para representar una moneda válida

    @ParameterizedTest // Anotación que indica que este método es una prueba unitaria parametrizada
    @ValueSource(ints = {-12387, -5, -1}) // Provee los valores que se usarán como parámetros en la prueba
    void constructorShouldThrowIAEForInvalidAmount(int invalidAmount){ // Método de prueba que verifica que el constructor de la clase Money lanza una excepción IllegalArgumentException para cantidades inválidas
        assertThatExceptionOfType(IllegalArgumentException.class) // Aserción que espera que se lance una excepción de tipo IllegalArgumentException
                .isThrownBy(()->{
                    new Money(invalidAmount, VALID_CURRENCY); // Intenta crear una nueva instancia de Money con una cantidad inválida y una moneda válida
                });
    }
}
