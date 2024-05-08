package com.wordz.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WordTest {
    // Prueba un intento con una letra incorrecta
    @Test
    public void oneIncorrectLetter() {
        // Creamos una palabra con una sola letra "A"
        var word = new Word("A");
        // Intentamos adivinar con la letra "Z"
        var score = word.guess("Z");
        // Verificamos que la puntuación sea INCORRECT
        assertScoreForGuess(score, Letter.INCORRECT);
    }

    // Prueba un intento con una letra correcta
    @Test
    public void oneCorrectLetter(){
        // Creamos una palabra con una sola letra "A"
        var word = new Word("A");
        // Intentamos adivinar con la letra "A"
        var score = word.guess("A");
        // Verificamos que la puntuación sea CORRECT
        assertScoreForGuess(score, Letter.CORRECT);
    }

    // Prueba un intento con una letra en posición incorrecta
    @Test
    void secondLetterWrongPosition() {
        // Creamos una palabra con dos letras "AR"
        var word = new Word("AR");
        // Intentamos adivinar con la letra "ZA"
        var score = word.guess("ZA");
        // Verificamos que la puntuación sea INCORRECT y PART_CORRECT
        assertScoreForGuess(score, Letter.INCORRECT, Letter.PART_CORRECT);
    }

    // Prueba un intento con todas las combinaciones de puntuación
    @Test
    void allScoreCombinations() {
        // Creamos una palabra con tres letras "ARI"
        var word = new Word("ARI");
        // Intentamos adivinar con la letra "ZAI"
        var score = word.guess("ZAI");
        // Verificamos que la puntuación sea INCORRECT, PART_CORRECT y CORRECT
        assertScoreForGuess(score, Letter.INCORRECT, Letter.PART_CORRECT, Letter.CORRECT);
    }

    // Método auxiliar para verificar la puntuación de un intento
    private void assertScoreForGuess(Score score, Letter... expectedScores){
        for (int position=0; position < expectedScores.length; position++){
            Letter expected = expectedScores[position];
            // Verificamos que la letra en la posición actual sea igual a la esperada
            assertThat(score.letter(position)).isEqualTo(expected);
        }
    }
}
