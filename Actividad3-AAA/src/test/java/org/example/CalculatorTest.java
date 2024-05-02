package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    //////////Test para valores únicos//////////
    //Implementacion de Test para todos los métodos de la clase Calculator
    //tomando en cuenta dos valores positivos(numeroA y numeroB) como parametros para
    //cada metodo del SUT
    @Test
    @DisplayName("Test del metodo suma, la suma de 10+5=15")
    public void testSum_PositiveNumbers_ShouldReturnCorrectSum(){
        //Arrange
        Calculator calculator = new Calculator();
        int numeroA = 10;
        int numeroB = 5;

        //Act
        int resultado = calculator.sumar(numeroA, numeroB);

        //Assert
        assertEquals(15, resultado, "10 + 5 deberia ser 15");
    }
    @Test
    @DisplayName("Test del metodo resta, la resta de 10-8=2")
    public void testRest_PositiveNumbers_ShouldReturnCorrectRest(){
        //Arrange
        Calculator calculator = new Calculator();
        int numeroA = 10;
        int numeroB = 8;

        //Act
        int resultado = calculator.restar(10, 8);

        //Assert
        assertEquals(2, resultado, "10 - 8 deberia ser 2");
    }
    @Test
    @DisplayName("Test del metodo multiplicacion, el producto de 8*2=16")
    public void testMult_PositiveNumbers_ShouldReturnCorrectMult(){
        //Arrange
        Calculator calculator = new Calculator();
        int numeroA = 8;
        int numeroB = 2;

        //Act
        int resultado = calculator.multiplicacion(8,2);

        //Assert
        assertEquals(16, resultado, "8 * 2 deberia ser 16");
    }
    @Test
    @DisplayName("Test del metodo division, el cociente de 50/10=5")
    public void testDiv_PosotiveNumbers_ShouldReturnCorrectDiv(){
        //Arrange
        Calculator calculator = new Calculator();
        int numeroA = 50;
        int numeroB = 10;

        //Act
        double resultado = calculator.division(numeroA, numeroB);

        //Assert
        assertEquals(5, resultado, "50 / 10 deberia ser 5");
    }

    //////////Test para valores múltiples//////////
    //Implementacion de Test para todos los métodos de la clase Calculator
    //tomando en cuenta más de dos valores positivos(numeroA1 y numeroB1), (numeroA2 y numeroB2), ...
    //como argumentos de cada metodo del SUT
    @ParameterizedTest
    @CsvSource({
            "10, 20, 30",
            "20, 30, 50",
            "1, 4, 5",
            "15, 12, 27"

    })
    @DisplayName("Test del metodo suma, 10+20=30, 20+30=50, 1+4=5, 15+12=27")
    public void testSum_multiplePositiveValues(int numA, int numB, int resultado){
        //arrange
        Calculator calculator = new Calculator();

        //act
        int resul = calculator.sumar(numA, numB);

        //assert
        assertEquals(resultado, resul);
    }
    @ParameterizedTest
    @CsvSource({
            "10, 5, 5",
            "15, 2, 13",
            "13, 8, 5",
            "11, 11, 0"
    })
    @DisplayName("Test del metodo resta, 10-5=5, 15-2=13, 13-8=5, 11-11=0")
    public void testRest_multiplePositiveValues(int numA, int numB, int esperado){
        //Arrange
        Calculator calculator = new Calculator();
        //Act
        int resultado = calculator.restar(numA, numB);
        //Assert
        assertEquals(esperado, resultado, numA + "-" +numB + " deberia dar " + esperado);
    }
    @ParameterizedTest
    @CsvSource({
            "10, 5, 50",
            "15, 2, 30",
            "10, 8, 80",
            "11, 11, 121"
    })
    @DisplayName("Test del metodo multiplicacion, 10*5=50, 15*2=30, 10*8=80, 11*11=121")
    public void testMult_multiplePositiveValues(int numA, int numB, int esperado){
        //Arrange
        Calculator calculator = new Calculator();
        //Act
        int resultado = calculator.multiplicacion(numA, numB);
        //Assert
        assertEquals(esperado, resultado, numA + "-" +numB + " deberia dar " + esperado);
    }
    //El test a continuacion toma en cuenta la division dos valores enteros y da como resultado
    // un cociente decimal, por ejemplo la division de 50/8=6.25
    @ParameterizedTest
    @CsvSource({
            "10, 5, 2.0",
            "80, 10, 8.0",
            "50, 8, 6.25",
            "8, 5, 1.6"
    })
    @DisplayName("Test del metodo division, 10/5=2.0, 80/10=8.0, 50/8=6.25, 8/5=1.6")
    public void testDiv_multiplePositiveValues(int numA, int numB, double esperado){
        //Arrange
        Calculator calculator = new Calculator();
        //Act
        double resultado = calculator.division(numA, numB);
        //assert
        assertEquals(esperado, resultado, numA + "/" +numB + " deberia dar " + esperado);
    }

    //////////Test para valores múltiples//////////
    //Implementacion de Test para todos los métodos de la clase Calculator
    //tomando en cuenta más de dos valores negativos(-numeroA1 y -numeroB1), (-numeroA2 y -numeroB2), ...
    //como argumentos de cada metodo del SUT
    @ParameterizedTest
    @CsvSource({
            "-10, -5, -15",
            "-8, -5, -13",
            "-1, -2 , -3",
            "-9, -52, -61"
    })
    @DisplayName("Test del metodo suma, -10+-5=-15, -8+-5=-13, -1+--2=-3, -9+-52=-61")
    public void testSum_multipleNegativeValues(int numA, int numB, int esperado){
        //Arrange
        Calculator calculator = new Calculator();
        //Act
        int resultado = calculator.sumar(numA, numB);
        //assert
        assertEquals(esperado, resultado, numA + "+" +numB + " deberia dar " + esperado);
    }
    @ParameterizedTest
    @CsvSource({
            "-10,-5,-5",
            "-15, -2, -13",
            "-13, -8, -5",
            "-11, -11, 0"
    })
    @DisplayName("Test del metodo resta, -10-(-5)=-5, -15-(-2)=-13, -13-(-8)=-5, -11-(-11)=0")
    public void testRest_multipleNegativeValues(int numA, int numB, int esperado){
        //Arrange
        Calculator calculator = new Calculator();
        //Act
        int resultado = calculator.restar(numA, numB);
        //Assert
        assertEquals(esperado, resultado, numA + "-" +numB + " deberia dar " + esperado);
    }
    @ParameterizedTest
    @CsvSource({
            "-10, -5, 50",
            "-15, -2, 30",
            "-10, -8, 80",
            "-11, -11, 121"
    })
    @DisplayName("Test del metodo multiplicacion, -10*-5=50, -15*-2=30, -10*-8=80, -11*-11=121")
    public void testMult_multipleNegativeValues(int numA, int numB, int esperado){
        //Arrange
        Calculator calculator = new Calculator();
        //Act
        int resultado = calculator.multiplicacion(numA, numB);
        //Assert
        assertEquals(esperado, resultado, numA + "-" +numB + " deberia dar " + esperado);
    }
    //El test a continuacion toma en cuenta la division dos valores enteros negativos y da como resultado
    // un cociente decimal, por ejemplo la division de -50/-8=6.25
    @ParameterizedTest
    @CsvSource({
            "-10, -5, 2.0",
            "-80, -10, 8.0",
            "-50, -8, 6.25",
            "-8, -5, 1.6"
    })
    @DisplayName("Test del metodo division, -10/-5=2.0, -80/-10=8.0, -50/-8=6.25, -8/-5=1.6")
    public void testDiv_multipleNegativeValues(int numA, int numB, double esperado){
        //Arrange
        Calculator calculator = new Calculator();
        //Act
        double resultado = calculator.division(numA, numB);
        //assert
        assertEquals(esperado, resultado, numA + "/" +numB + " deberia dar " + esperado);
    }

    //////////Division por cero//////////
    //El siguiente caso de prueba muestra la division por cero,
    //Al ingresar numeroB=0 como argumento del método dividir, se muestra la excepcion ArithmeticException
    @Test
    public void testDiv_numBCero(){
        Calculator calculator = new Calculator();
        int numeroA = 5;
        int numberoB = 0;

        assertThatExceptionOfType(ArithmeticException.class)
                .isThrownBy(() -> calculator.division(numeroA, numberoB))
                .withMessage("Division por cero");
    }

}