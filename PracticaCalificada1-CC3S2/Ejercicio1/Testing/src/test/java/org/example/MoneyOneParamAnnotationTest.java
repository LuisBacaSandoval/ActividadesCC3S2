package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Clase de prueba para probar el constructor de la clase Money
 * utilizando la anotación @ValueSource para proporcionar múltiples valores de entrada.
 */
public class MoneyOneParamAnnotationTest {

    /**
     * Método de prueba parametrizado que utiliza @ValueSource para proporcionar múltiples valores
     * de monto como entrada al constructor de Money.
     */
    @ParameterizedTest
    @ValueSource(ints={10,15,50}) // Proporciona valores de prueba
    void constructorShouldSetAmountAndCurrency(int amount){
        // Creación de una instancia de Money con el monto proporcionado y la moneda USD
        Money money = new Money(amount, "USD");

        // Verificación utilizando AssertJ de que el monto se estableció correctamente en la instancia de Money
        assertThat(money.getAmount()).isEqualTo(amount);
    }
}
