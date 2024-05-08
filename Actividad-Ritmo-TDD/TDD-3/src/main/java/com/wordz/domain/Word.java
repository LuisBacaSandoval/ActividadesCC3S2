package com.wordz.domain;

public class Word {
    // El constructor recibe la palabra correcta
    private final String word;
    public Word(String correctWord) {
        this.word = correctWord;
    }

    // El método guess devuelve una puntuación para un intento
    public Score guess(String attempt) {
        // Creamos una nueva puntuación con la palabra correcta
        var score = new Score(word);
        // Evaluamos el intento y devolvemos la puntuación
        score.assess(attempt);
        return score;
    }
}
