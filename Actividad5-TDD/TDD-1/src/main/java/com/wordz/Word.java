package com.wordz;

public class Word {
    private String correctWord;

    public Word(String correctWord) {
        this.correctWord = correctWord;
    }

    public Score guess(String attempt) {
        Score score = new Score();
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