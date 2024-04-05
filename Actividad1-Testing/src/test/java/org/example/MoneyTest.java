package org.example;
import org.junit.jupiter.api.Test;//permite la anotacion @Test
import static org.assertj.core.api.Assertions.assertThat;//importacion estatica del metodo

class MoneyTest {//clase de prueba, no amplia ni una clase base ni interfaz
    @Test//permite reconocer el metodo de prueba
    void constructorShouldSetAmountAndCurrency() {//metodo de prueba
        // Completa
        Money money = new Money(10, "USD");//SUT
        //Aserciones
        assertThat(money.getAmount()).isEqualTo(10);
        assertThat(money.getCurrency()).isEqualTo("USD");//SUT se pone a prueba
    }

}

/*
SUT -> Sistema bajo prueba-System Under Test
DOC -> Depend On Component-Cualquier cosa para que el SUT funcione

src//main/java codigo de produccion
src/main/test codigo de prueba
src/test/resources recursos de prueba

assertThat prepara el escenario para que los metodos que le siguen hagan alguna verificacion real
firma de metodo -> es el nombre y variables del metodo

@BeforeEach es un metodo de marcado, se ejecuta antes del metodo de prueba

AAA - Arrange Act Assert
isSetUp: Responsable de configurar el accesorio de pruebas
JUnit5 ignora el nombre de los metodos pero respeta las anotaciones de los metodos
metodos de configuracion:
*/