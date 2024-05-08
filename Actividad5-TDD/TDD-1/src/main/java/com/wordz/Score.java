package com.wordz;

/**
 * Representa una puntuación para una palabra intentada, indicando la corrección de cada letra.
 */
public class Score {
    private Letter[] letters;

    /**
     * Crea una nueva instancia de Score con la longitud de la palabra dada.
     *
     * @param wordLength la longitud de la palabra
     */
    public Score(int wordLength) {
        this.letters = new Letter[wordLength];
    }

    /**
     * Establece la letra en la posición dada con el estado de letra dado.
     *
     * @param position la posición de la letra
     * @param letter el estado de la letra (CORRECT, PART_CORRECT o INCORRECT)
     */
    public void setLetter(int position, Letter letter) {
        this.letters[position] = letter;
    }

    /**
     * Devuelve el estado de la letra en la posición dada.
     *
     * @param position la posición de la letra
     * @return el estado de la letra (CORRECT, PART_CORRECT o INCORRECT)
     */
    public Letter letter(int position) {
        return this.letters[position];
    }
}
