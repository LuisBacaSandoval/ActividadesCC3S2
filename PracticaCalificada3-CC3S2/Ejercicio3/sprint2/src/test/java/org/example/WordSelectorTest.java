package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

class WordSelectorTest {
    private WordSelector wordSelector;

    @BeforeEach
    public void setUp() {
        wordSelector = new WordSelector();
    }

    //test para que si seleccionas una palabra esta no debe ser nula
    @Test
    public void palabraSeleccionadaNoNula(){
        Word word = wordSelector.selectWord();//seleciona una palabra

        assertNotNull(word, "La palabra seleccionada no debería ser nula");

    }

    //test para que si seleccionas una palabra esta debe estar dentro de la lista de palabras
    @Test
    public void palabraSeleccionadaSeEncuentraEnLaLista() {
        Word word = wordSelector.selectWord();//seleciona una palabra

        String[] validWords = {"ciencias", "computacion", "desarrollo", "software"};//lista de palabras

        assertTrue(asList(validWords).contains(word.getWord()), "La palabra seleccionada debería estar en la lista de palabras");
    }

}