package org.example.Sprint2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Word2Test {
    // Prueba un intento con una letra incorrecta
    @Test
    public void oneIncorrectLetter() {
        // Creamos una palabra con una sola letra "A"
        var word = new Word2("A");
        // Intentamos adivinar con la letra "Z"
        var score = word.guess("Z");
        // Verificamos que la puntuación sea INCORRECT
        assertScoreForGuess(score, Letter2.INCORRECT);
    }

    // Prueba un intento con una letra correcta
    @Test
    public void oneCorrectLetter(){
        // Creamos una palabra con una sola letra "A"
        var word = new Word2("A");
        // Intentamos adivinar con la letra "A"
        var score = word.guess("A");
        // Verificamos que la puntuación sea CORRECT
        assertScoreForGuess(score, Letter2.CORRECT);
    }

    // Prueba un intento con una letra en posición incorrecta
    @Test
    void secondLetterWrongPosition() {
        // Creamos una palabra con dos letras "AR"
        var word = new Word2("AR");
        // Intentamos adivinar con la letra "ZA"
        var score = word.guess("ZA");
        // Verificamos que la puntuación sea INCORRECT y PART_CORRECT
        assertScoreForGuess(score, Letter2.INCORRECT, Letter2.PART_CORRECT);
    }

    // Prueba un intento con todas las combinaciones de puntuación
    @Test
    void allScoreCombinations() {
        // Creamos una palabra con tres letras "ARI"
        var word = new Word2("ARI");
        // Intentamos adivinar con la letra "ZAI"
        var score = word.guess("ZAI");
        // Verificamos que la puntuación sea INCORRECT, PART_CORRECT y CORRECT
        assertScoreForGuess(score, Letter2.INCORRECT, Letter2.PART_CORRECT, Letter2.CORRECT);
    }

    // Método auxiliar para verificar la puntuación de un intento
    private void assertScoreForGuess(Score2 score, Letter2... expectedScores){
        for (int position=0; position < expectedScores.length; position++){
            Letter2 expected = expectedScores[position];
            // Verificamos que la letra en la posición actual sea igual a la esperada
            assertThat(score.letter(position)).isEqualTo(expected);
        }
    }
}