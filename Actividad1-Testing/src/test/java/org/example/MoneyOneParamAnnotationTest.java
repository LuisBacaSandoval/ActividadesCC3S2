package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.assertj.core.api.Assertions.assertThat;

public class MoneyOneParamAnnotationTest {
    @ParameterizedTest // Anotación que indica que este método es una prueba unitaria parametrizada
    @ValueSource(ints={10,15,50}) // Provee los valores que se usarán como parámetros en la prueba
    void constructorShouldSetAmountAndCurrency(int amount){ // Método de prueba que verifica que el constructor de la clase Money establece correctamente la cantidad
        Money money = new Money(amount, "USD"); // Crea una nueva instancia de Money con la cantidad proporcionada y la moneda "USD"

        // Aserción
        assertThat(money.getAmount()).isEqualTo(amount); // Verifica que la cantidad de dinero es igual al valor del parámetro
    }
}
