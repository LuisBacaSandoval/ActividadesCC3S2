package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HintGeneratorTest {
    private HintGenerator hintGenerator;

    @BeforeEach
    public void setUp() {
        hintGenerator = new HintGenerator();
    }

    //test para verificar que la primera pista sea que la palabra tenga 7 letras
    @Test
    public void testGenerateInitialHint() {
        Word word = new Word("manzana");
        String hint = hintGenerator.generateInitialHint(word);
        assertEquals("La palabra tiene 7 letras.", hint, "La pista inicial debería indicar el número correcto de letras");
    }

    //test para una palabra correcta
    @Test
    public void testGenerateHint() {
        String hint = hintGenerator.generateHint("manzana", "manzana");
        assertEquals("Tienes 7 letras correctas en la posición correcta.", hint, "La pista debería indicar todas las letras correctas en la posición correcta");
    }

    //test para una palabra parcialmente correcta
    @Test
    public void testGenerateHintPartialMatch() {
        String hint = hintGenerator.generateHint("manzana", "banana");
        assertEquals("Tienes 2 letras correctas en la posición correcta.", hint, "La pista debería indicar la cantidad correcta de letras en la posición correcta");
    }


}