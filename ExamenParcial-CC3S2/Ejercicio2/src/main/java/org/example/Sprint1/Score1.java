package org.example.Sprint1;

import java.util.ArrayList;
import java.util.List;

public class Score1 {
    // La palabra correcta
    private final String correct;
    // La lista de resultados (letras evaluadas)
    private final List<Letter1> results = new ArrayList<>();
    // La posición actual en la palabra
    private int position;

    // Constructor que recibe la palabra correcta
    public Score1(String correct) {
        this.correct = correct;
    }

    // Devuelve la letra evaluada en una posición específica
    public Letter1 letter(int position) {
        return results.get(position);
    }

    // Evalúa un intento y actualiza la puntuación
    public void assess(String attempt) {
        for (char current : attempt.toCharArray()) {
            // Agregamos el resultado de la evaluación a la lista
            results.add(scoreFor(current));
            position++;
        }
    }

    // Comprueba si una letra es correcta en la posición actual
    private boolean isCorrectLetter(char currentLetter) {
        return correct.charAt(position) == currentLetter;
    }

    // Comprueba si una letra aparece en la palabra correcta
    private boolean occursInWord(char current) {
        return correct.contains(String.valueOf(current));
    }

    // Evalúa una letra y devuelve su puntuación
    private Letter1 scoreFor(char current) {
        if (isCorrectLetter(current)) {
            return Letter1.CORRECT;
        }
        if (occursInWord(current)) {
            return Letter1.PART_CORRECT;
        }
        return Letter1.INCORRECT;
    }

    public List<Letter1> getResults() {
        return results;
    }
}
