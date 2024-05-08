package com.wordz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de prueba para la clase Word.
 */
class WordTest {
    /**
     * Prueba que una letra incorrecta devuelve un estado de letra INCORRECT.
     */
    @Test
    public void oneIncorrectLetter() {
        // Creamos una instancia de Word con la palabra "A"
        Word word = new Word("A");
        // Intentamos adivinar la palabra con la letra "Z"
        Score score = word.guess("Z");
        // Obtenemos el estado de la letra en la posición 0
        Letter result = score.letter(0);
        // Verificamos que el estado de la letra sea INCORRECT
        assertThat(result).isEqualTo(Letter.INCORRECT);
    }

    /**
     * Prueba que una letra correcta devuelve un estado de letra CORRECT.
     */
    @Test
    public void oneCorrectLetter() {
        // Creamos una instancia de Word con la palabra "A"
        Word word = new Word("A");
        // Intentamos adivinar la palabra con la letra "A"
        Score score = word.guess("A");
        // Obtenemos el estado de la letra en la posición 0
        Letter result = score.letter(0);
        // Verificamos que el estado de la letra sea CORRECT
        assertThat(result).isEqualTo(Letter.CORRECT);
    }

    /**
     * Prueba que una letra parcialmente correcta devuelve un estado de letra PART_CORRECT.
     */
    @Test
    public void onePartCorrectLetter() {
        // Creamos una instancia de Word con la palabra "ABC"
        Word word = new Word("ABC");
        // Intentamos adivinar la palabra con la letra "ACD"
        Score score = word.guess("ACD");
        // Obtenemos el estado de la letra en la posición 1
        Letter result = score.letter(1);
        // Verificamos que el estado de la letra sea PART_CORRECT
        assertThat(result).isEqualTo(Letter.PART_CORRECT);
    }
}