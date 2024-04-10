package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {
    // Método de prueba para verificar si el constructor establece correctamente la cantidad y la moneda
    @Test
    void constructorShouldSetAmountAndCurrency() {
        // Crear una instancia de Money con una cantidad de 10 y la moneda "USD"
        Money money = new Money(10, "USD"); // Sistema Bajo Prueba (SUT)

        // Verificar si la cantidad establecida por el constructor es igual a 10
        assertThat(money.getAmount()).isEqualTo(10);

        // Verificar si la moneda establecida por el constructor es "USD"
        assertThat(money.getCurrency()).isEqualTo("USD");
    }
}