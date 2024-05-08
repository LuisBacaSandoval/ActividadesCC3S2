package org.example;

// Definición de la clase Calculator
public class Calculator {

    // Método para sumar dos números enteros
    public int sumar(int numeroA, int numeroB) {
        return numeroA + numeroB; // Retorna la suma de numeroA y numeroB
    }

    // Método para restar dos números enteros
    public int restar(int numeroA, int numeroB) {
        return numeroA - numeroB; // Retorna la resta de numeroA menos numeroB
    }

    // Método para multiplicar dos números enteros
    public int multiplicacion(int numeroA, int numeroB) {
        return numeroA * numeroB; // Retorna el producto de numeroA y numeroB
    }

    // Método para dividir dos números enteros
    public double division(int numeroA, int numeroB) {
        // Comprueba si el denominador es cero para evitar división por cero
        if (numeroB == 0) {
            throw new ArithmeticException("Division por cero"); // Lanza una excepción si es cero
        }
        // Realiza la división y retorna el resultado como un double para permitir decimales
        return (double) numeroA / numeroB;
    }
}
