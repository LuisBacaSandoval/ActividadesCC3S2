package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * Clase de prueba para probar el constructor de la clase Money utilizando
 * la anotación @CsvSource para proporcionar múltiples conjuntos de parámetros.
 */
public class MoneyManyParamsAnnotationTest {

    /**
     * Método de prueba parametrizado que utiliza @CsvSource para proporcionar múltiples conjuntos de valores de entrada
     * al constructor de Money.
     */
    @ParameterizedTest
    @CsvSource({//Permite especificar muchos valores por cada caso de prueba
            "10, USD",
            "15, EUR",
            "50, CHF"
    })
    void constructorShouldSetAmountAndCurrency(int amount, String currency){
        // Creación de una instancia de Money utilizando los parámetros proporcionados
        Money money = new Money(amount, currency);

        // Verificación utilizando AssertJ de que el monto y la moneda se establecieron correctamente en la instancia de Money
        assertThat(money.getAmount()).isEqualTo(amount);
        assertThat(money.getCurrency()).isEqualTo(currency);
    }
}