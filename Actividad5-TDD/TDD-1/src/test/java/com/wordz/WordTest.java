package com.wordz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class WordTest {
    @Test
    public void oneIncorrectLetter() {
        Word word = new Word("A");
        Score score = word.guess("Z");
        Letter result = score.letter(0);
        assertThat(result).isEqualTo(Letter.INCORRECT);
    }

    @Test
    public void oneCorrectLetter() {
        Word word = new Word("A");
        Score score = word.guess("A");
        Letter result = score.letter(0);
        assertThat(result).isEqualTo(Letter.CORRECT);
    }

    @Test
    public void onePartCorrectLetter() {
        Word word = new Word("ABC");
        Score score = word.guess("ACD");
        Letter result = score.letter(1);
        assertThat(result).isEqualTo(Letter.PART_CORRECT);
    }
}