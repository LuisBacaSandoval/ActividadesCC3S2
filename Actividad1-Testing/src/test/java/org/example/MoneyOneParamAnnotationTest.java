package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.assertj.core.api.Assertions.assertThat;

public class    MoneyOneParamAnnotationTest {
    @ParameterizedTest
    @ValueSource(ints={10,15,50}) //Proporciona valores de prueba
    void constructorShouldSetAmountAndCurrency(int amount){
        Money money = new Money(amount, "USD");
        //Completa
        assertThat(money.getAmount()).isEqualTo(amount);
    }
}
