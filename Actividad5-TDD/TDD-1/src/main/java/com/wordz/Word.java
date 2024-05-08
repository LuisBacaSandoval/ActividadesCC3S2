package com.wordz;

/**
 * Representa una palabra que debe ser adivinada.
 */
public class Word {
    private String correctWord;

    /**
     * Crea una nueva instancia de Word con la palabra correcta dada.
     *
     * @param correctWord la palabra correcta que debe ser adivinada
     */
    public Word(String correctWord) {
        this.correctWord = correctWord;
    }

    /**
     * Intenta adivinar una palabra y devuelve una puntuación que indica la corrección de cada letra.
     *
     * @param attempt la palabra intentada
     * @return una puntuación que indica la corrección de cada letra
     */
    public Score guess(String attempt) {
        Score score = new Score(correctWord.length()); // Inicializa la puntuación con la longitud de la palabra correcta
        for (int i = 0; i < correctWord.length(); i++) {
            if (attempt.charAt(i) == correctWord.charAt(i)) {
                score.setLetter(i, Letter.CORRECT);
            } else if (correctWord.indexOf(attempt.charAt(i))!= -1) {
                score.setLetter(i, Letter.PART_CORRECT);
            } else {
                score.setLetter(i, Letter.INCORRECT);
            }
        }
        return score;
    }
}