package org.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MoneyManyValuesTest {
    public static final String USD="USD"; // Constante para representar la moneda "USD"

    @Test
    void constructorShouldSetAmountAndCurrency(){ // Método de prueba para verificar que el constructor de la clase Money establece correctamente la cantidad y la moneda
        Money money = new Money(10, USD); // Crea una nueva instancia de Money con la cantidad 10 y la moneda "USD"

        // Aserciones
        assertThat(money.getAmount()).isEqualTo(10); // Verifica que la cantidad de dinero es 10
        assertThat(money.getCurrency()).isEqualTo(USD); // Verifica que la moneda es "USD"

        money = new Money(20, USD); // Crea una nueva instancia de Money con la cantidad 20 y la moneda "USD"

        // Aserciones
        assertThat(money.getAmount()).isEqualTo(20); // Verifica que la cantidad de dinero es 20
        assertThat(money.getCurrency()).isEqualTo(USD); // Verifica que la moneda es "USD"

        // Este patrón se repetiría para otros valores como 100, 999, 23908423, etc.
    }
}
