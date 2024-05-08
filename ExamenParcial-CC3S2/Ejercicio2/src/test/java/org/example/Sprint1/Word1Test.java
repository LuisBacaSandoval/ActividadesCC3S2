package org.example.Sprint1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Word1Test {
    // Prueba un intento con una letra incorrecta
    @Test
    public void oneIncorrectLetter() {
        // Creamos una palabra con una sola letra "A"
        var word = new Word1("A");
        // Intentamos adivinar con la letra "Z"
        var score = word.guess("Z");
        // Verificamos que la puntuación sea INCORRECT
        assertScoreForGuess(score, Letter1.INCORRECT);
    }

    // Prueba un intento con una letra correcta
    @Test
    public void oneCorrectLetter(){
        // Creamos una palabra con una sola letra "A"
        var word = new Word1("A");
        // Intentamos adivinar con la letra "A"
        var score = word.guess("A");
        // Verificamos que la puntuación sea CORRECT
        assertScoreForGuess(score, Letter1.CORRECT);
    }
    // Método auxiliar para verificar la puntuación de un intento
    private void assertScoreForGuess(Score1 score, Letter1... expectedScores){
        for (int position=0; position < expectedScores.length; position++){
            Letter1 expected = expectedScores[position];
            // Verificamos que la letra en la posición actual sea igual a la esperada
            assertThat(score.letter(position)).isEqualTo(expected);
        }
    }
}