package com.wordz;

public class Score {
    private Letter[] letters;

    public Score() {
        this.letters = new Letter[5]; // Asumimos que la palabra tiene 5 letras
    }

    public void setLetter(int position, Letter letter) {
        this.letters[position] = letter;
    }

    public Letter letter(int position) {
        return this.letters[position];
    }
}
