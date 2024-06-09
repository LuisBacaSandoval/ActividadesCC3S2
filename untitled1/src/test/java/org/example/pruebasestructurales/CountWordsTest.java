package org.example.pruebasestructurales;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class CountWordsTest {

    //prueba Contar palabras que terminan en S
    @Test
    void testCountWordsEndingWithS() {
        int words = new CountWords().count("dogs cats");
        assertThat(words).isEqualTo(2);
    }

    //prueba Contar palabras que terminan en R
    @Test
    void testCountWordsEndingWithR() {
        int words = new CountWords().count("car bar");
        assertThat(words).isEqualTo(2);
    }

    //prueba No cuente palabras que terminen en S o E
    @Test
    void testCountNoWordsEndingWithSOrR() {
        int words = new CountWords().count("dog cat");
        assertThat(words).isEqualTo(0);
    }

    //prueba contar palabras con caracteres especiales
    /*@Test
    void testCountWordsWithSpecialCharacters() {
        int words = new CountWords().count("dog's car!");
        assertThat(words).isEqualTo(1);
    }*/

    //prueba cadena vacía
    @Test
    void testEmptyString() {
        int words = new CountWords().count("");
        assertThat(words).isEqualTo(0);
    }

    //Prueba de recuento de un solo carácter S
    @Test
    void testCountSingleCharacterS() {
        int words = new CountWords().count("s");
        assertThat(words).isEqualTo(1);
    }

    //Prueba de recuento de un solo carácter R
    @Test
    void testCountSingleCharacterR() {
        int words = new CountWords().count("r");
        assertThat(words).isEqualTo(1);
    }

    //prueba Recuento Un solo carácter No letra
    @Test
    void testCountSingleCharacterNonLetter() {
        int words = new CountWords().count("1");
        assertThat(words).isEqualTo(0);
    }

    //prueba Contar palabras que terminan en R y S
    @Test
    void testCountWordsEndingWithRAndS() {
        int words = new CountWords().count("runners dogs cars");
        assertThat(words).isEqualTo(3);
    }

    //prueba contar palabras que terminan en ninguno
    @Test
    void testCountWordsEndingWithNeither() {
        int words = new CountWords().count("hello world");
        assertThat(words).isEqualTo(0);
    }

    //prueba Contar palabras que terminan en S y caracteres especiales
    @Test
    void testCountWordsEndingWithSAndSpecialChar() {
        int words = new CountWords().count("dogs cats@");
        assertThat(words).isEqualTo(2);
    }

    //prueba Contar palabras que comienzan con letras que no son letras
    @Test
    void testCountWordsStartingWithNonLetter() {
        int words = new CountWords().count("1dogs 2cats");
        assertThat(words).isEqualTo(2);
    }

    //prueba contar palabras con espacios
    @Test
    void testCountWordsWithSpaces() {
        int words = new CountWords().count("dogs cats");
        assertThat(words).isEqualTo(2);
    }

}