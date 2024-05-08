package org.example.Sprint1;

public class Word1 {
    // El constructor recibe la palabra correcta
    private final String word;
    public Word1(String correctWord) {
        this.word = correctWord;
    }

    // El método guess devuelve una puntuación para un intento
    public Score1 guess(String attempt) {
        // Creamos una nueva puntuación con la palabra correcta
        var score = new Score1(word);
        // Evaluamos el intento y devolvemos la puntuación
        score.assess(attempt);
        return score;
    }
}
