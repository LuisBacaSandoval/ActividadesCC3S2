package org.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Clase de prueba para probar el constructor de la clase Money con varios valores de entrada.
 **/
public class MoneyManyValuesTest {
    // Definición de una constante para la moneda USD
    public static final String USD = "USD";

    /**
     * Método de prueba que verifica si el constructor de Money
     * establece correctamente el monto y la moneda.
     */
    @Test
    void constructorShouldSetAmountAndCurrency(){
        // Creación de una instancia de Money con un monto de 10 y la moneda USD
        Money money = new Money(10, USD);
        // Verificación de que el monto y la moneda se establecieron correctamente
        assertThat(money.getAmount()).isEqualTo(10);
        assertThat(money.getCurrency()).isEqualTo(USD);

        // Creación de una nueva instancia de Money con un monto de 20 y la moneda USD
        money = new Money(20, USD);
        // Verificación de que el nuevo monto y la moneda se establecieron correctamente
        assertThat(money.getAmount()).isEqualTo(20);
        assertThat(money.getCurrency()).isEqualTo(USD);

    }
}
