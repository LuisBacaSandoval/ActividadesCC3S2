package org.example;

public class HintGenerator {
    public String generateInitialHint(Word word) {
        return "La palabra tiene " + word.getWord().length() + " letras.";
    }

    public String generateHint(String hiddenWord, String guess) {
        return "Esta es una pista.";
    }
}

