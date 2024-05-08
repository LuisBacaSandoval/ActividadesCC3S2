package org.example.Sprint2;

import org.example.Sprint1.Score1;

public class Word2 {
    // El constructor recibe la palabra correcta
    private final String word;
    public Word2(String correctWord) {
        this.word = correctWord;
    }

    // El método guess devuelve una puntuación para un intento
    public Score2 guess(String attempt) {
        // Creamos una nueva puntuación con la palabra correcta
        var score = new Score2(word);
        // Evaluamos el intento y devolvemos la puntuación
        score.assess(attempt);
        return score;
    }
}

