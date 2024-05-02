package org.example;
import org.junit.jupiter.api.Test;//permite la anotacion @Test
import static org.assertj.core.api.Assertions.assertThat;//importacion estatica del metodo

class MoneyTest {
    @Test // Anotación que indica que este método es una prueba unitaria
    void constructorShouldSetAmountAndCurrency() { // Método de prueba para verificar que el constructor de la clase Money establece correctamente la cantidad y la moneda
        Money money = new Money(10, "USD"); // Crea una nueva instancia de Money (SUT)

        // Aserciones
        assertThat(money.getAmount()).isEqualTo(10); // Verifica que la cantidad de dinero es 10
        assertThat(money.getCurrency()).isEqualTo("USD"); // Verifica que la moneda es "USD"
    }
}