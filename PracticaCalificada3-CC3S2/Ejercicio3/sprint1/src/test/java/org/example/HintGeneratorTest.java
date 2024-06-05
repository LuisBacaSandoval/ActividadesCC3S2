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

    //test inicial del tdd, siempre pasará ya que el metodo generateHint() de la clase HintGenerator siempre nos devolvera dicha cadena
    @Test
    public void testGenerateHint() {
        String hint = hintGenerator.generateHint("manzana", "manzana");
        assertEquals("Esta es una pista.", hint, "La pista debería indicar todas las letras correctas en la posición correcta");
    }

}