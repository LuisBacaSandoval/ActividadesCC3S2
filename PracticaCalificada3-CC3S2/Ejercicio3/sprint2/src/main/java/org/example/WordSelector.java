package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordSelector {//Clase que genera palabras aleatorias de una lista dada
    private List<Word> wordList;

    public WordSelector() {
        wordList = new ArrayList<>();
        wordList.add(new Word("ciencias"));
        wordList.add(new Word("computacion"));
        wordList.add(new Word("desarrollo"));
        wordList.add(new Word("software"));
    }

    public Word selectWord() {//metodo que devolvera la palabra aleatoria
        Random random = new Random();
        int index = random.nextInt(wordList.size());
        return wordList.get(index);
    }
}

