package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MoneyManyParamsAnnotationTest {
    @ParameterizedTest // Anotación que indica que este método es una prueba unitaria parametrizada
    @CsvSource({ // Anotación que permite especificar múltiples conjuntos de valores para cada caso de prueba
            "10, USD",
            "15, EUR",
            "50, CHF"
    })
    void constructorShouldSetAmountAndCurrency(int amount, String currency){ // Método de prueba que verifica que el constructor de la clase Money establece correctamente la cantidad y la moneda
        Money money = new Money(amount, currency); // Crea una nueva instancia de Money con la cantidad y la moneda proporcionadas

        // Aserciones
        assertThat(money.getAmount()).isEqualTo(amount); // Verifica que la cantidad de dinero es igual al valor del parámetro
        assertThat(money.getCurrency()).isEqualTo(currency); // Verifica que la moneda es igual al valor del parámetro
    }
}
