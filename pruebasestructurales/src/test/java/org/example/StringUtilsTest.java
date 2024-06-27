package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.example.StringUtils.substringsBetween;
import static org.junit.jupiter.api.Assertions.assertThrows;

/*public class StringUtilsTest {

    @Test
    void strIsNullOrEmpty() {
        // T1: str es nulo.
        assertThat(StringUtils.substringsBetween(null, "a", "b")).isEqualTo(null);
        // T2: str está vacío.
        assertThat(StringUtils.substringsBetween("", "a", "b")).isEqualTo(new String[]{});
    }

    @Test
    void openIsNullOrEmpty() {
        // T3: open es nulo.
        //Assertions.assertThat(StringUtils.substringsBetween("abc", null, "b")).isEqualTo(null);
        // T4: open está vacío.
        // Assertions.assertThat(StringUtils.substringsBetween("abc", "", "c")).isEqualTo(null);
    }

    @Test
    void closeIsNullOrEmpty() {
        // T5: close es nulo.
        //Assertions.assertThat(StringUtils.substringsBetween("abc", "a", null)).isEqualTo(null);
        // T6: close está vacío.
        // Assertions.assertThat(StringUtils.substringsBetween("abc", "a", "")).isEqualTo(null);
    }

    // Cadena de longitud 1
    @Test
    void strOfLength1() {
        // T7: el carácter único en str coincide con la etiqueta open.
        assertThat(StringUtils.substringsBetween("a", "a", "b")).isEqualTo(null);
        // T8: El carácter único en str coincide con la etiqueta de close.
        assertThat(StringUtils.substringsBetween("a", "b", "a")).isEqualTo(null);
        // T9: El carácter único en str no coincide ni con la etiqueta de open ni con la de close.
        assertThat(StringUtils.substringsBetween("a", "b", "b")).isEqualTo(null);
        // T10: el carácter único en str coincide con las etiquetas de open y close.
        assertThat(StringUtils.substringsBetween("a", "a", "a")).isEqualTo(null);
    }

    // cadena de longitud > 1, longitud de open = 1, longitud de close = 1:
    @Test
    void openAndCloseOfLength1() {
        // T11: str no contiene ni la etiqueta de open ni la de close.
        assertThat(StringUtils.substringsBetween("abc", "x", "y")).isEqualTo(null);
        // T12: str contiene la etiqueta open pero no contiene la etiqueta close.
        assertThat(StringUtils.substringsBetween("abc", "a", "y")).isEqualTo(null);
        // T13: str contiene la etiqueta de close pero no contiene la etiqueta de open.
        assertThat(StringUtils.substringsBetween("abc", "x", "c")).isEqualTo(null);
        // T14: str contiene las etiquetas de open y close.
        assertThat(StringUtils.substringsBetween("abc", "a", "c")).isEqualTo(new String[]{"b"});
        // T15: str contiene las etiquetas de open y close varias veces. <- falta implementar
        assertThat(StringUtils.substringsBetween("abcabcabc", "a", "c")).isEqualTo(new String[]{"b", "b", "b"});
        // ... previas aseveraciones aquí
        assertThat(StringUtils.substringsBetween("abcabyt byrc", "a", "c")).isEqualTo(new String[]{"b", "bytbyr"});
    }

    // cadena de longitud > 1, longitud de open > 1, longitud de close > 1:
    @Test
    void openAndCloseTagsOfDifferentSizes() {
        // T16: str no contiene ni la etiqueta de open ni la de close.
        assertThat(StringUtils.substringsBetween("aabcc", "xx", "yy")).isEqualTo(null);
        // T17: str contiene la etiqueta open pero no contiene la etiqueta close.
        assertThat(StringUtils.substringsBetween("aabcc", "aa", "yy")).isEqualTo(null);
        // T18: str contiene la etiqueta de close pero no contiene la etiqueta de open.
        assertThat(StringUtils.substringsBetween("aabcc", "xx", "cc")).isEqualTo(null);
        // T19: str contiene las etiquetas de open y close.
        assertThat(StringUtils.substringsBetween("aabbcc", "aa", "cc")).isEqualTo(new String[]{"bb"});
        // T20: str contiene las etiquetas de open y close varias veces.
        assertThat(StringUtils.substringsBetween("aabbccaaeecc", "aa", "cc")).isEqualTo(new String[]{"bb", "ee"});
        // ... previas aseveraciones aquí
        assertThat(StringUtils.substringsBetween("aabb ddccca abbccc", "aa", "ccc")).isEqualTo(new String[]{"bbdd", "bb"});
    }

    //  str contiene las etiquetas de open y close sin caracteres entre ellas.
    @Test
    void notSubstringBetweenOpenAndCloseTags() {
        // T21: str contiene las etiquetas de open y close sin caracteres entre ellas.
        assertThat(StringUtils.substringsBetween("aabb", "aa", "bb")).isEqualTo(new String[]{""});
    }

    // open o close es una cadena vacía.
    @Test
    void throwsExceptionWhenOpenOrCloseIsEmpty() {
        // T25: open es una cadena vacía.-> Retorna InvalidDelimiterException
        assertThrows(InvalidDelimiterException.class, () -> {
            StringUtils.substringsBetween("abc", "", "c");
        });
        // T26: close es una cadena vacía.-> Retorna InvalidDelimiterException
        assertThrows(InvalidDelimiterException.class, () -> {
            StringUtils.substringsBetween("abc", "a", "");
        });
    }

    @Test
    void regexSimpleCase() {
        assertThat(StringUtils.regexSubstringsBetween("abcd", "a", "d")).isEqualTo(new String[] { "bc" });
    }

    @Test
    void regexManyStrings() {
        assertThat(StringUtils.regexSubstringsBetween("abcdabcdab", "a", "d")).isEqualTo(new String[]
                { "bc", "bc" });
    }

    @Test
    void regexOpenAndCloseTagsThatAreLongerThan1Char() {
        assertThat(StringUtils.regexSubstringsBetween("aabcddaabfddaab", "aa", "dd")).isEqualTo(new
                String[] { "bc", "bf" });
    }

}*/

public class StringUtilsTest{
    @Test
    void strIsNullOrEmpty() {
        //T1: str es nulo.
        assertThat(substringsBetween(null, "a", "b")).isEqualTo(null);
        //T2: str está vacío
        assertThat(substringsBetween("", "a", "b")).isEqualTo(new String[]{});
    }
    //A continuación están todas las pruebas relacionadas con que open o close sea nulo o vacío.
    @Test
    void openIsNullOrEmpty() {
        //T3: open es nulo.
        assertThat(substringsBetween("abc", null, "b")).isEqualTo(null);
        //T4: open está vacío
        //assertThat(substringsBetween("abc", "", "b")).isEqualTo(null);
    }
    @Test
    void closeIsNullOrEmpty() {
        //T5: close es nulo
        assertThat(substringsBetween("abc", "a", null)).isEqualTo(null);
        //T6: close está vacío.
        //assertThat(substringsBetween("abc", "a", "")).isEqualTo(null);
    }
    //Ahora vienen todas las pruebas relacionadas con cadenas y etiquetas open y close con longitud 1.
    @Test
    void strOfLength1() {
        //T7: el carácter único en str coincide con la etiqueta open.
        assertThat(substringsBetween("a", "a", "b")).isEqualTo(null);
        //T8: El carácter único en str coincide con la etiqueta de close
        assertThat(substringsBetween("a", "b", "a")).isEqualTo(null);
        //T9: El carácter único en str no coincide ni con la etiqueta de open ni con la de close
        assertThat(substringsBetween("a", "b", "b")).isEqualTo(null);
        //T10: el carácter único en str coincide con las etiquetas de open y close.
        assertThat(substringsBetween("a", "a", "a")).isEqualTo(null);
    }
    @Test
    void openAndCloseOfLength1() {
        //T11: str no contiene ni la etiqueta de open ni la de close.
        assertThat(substringsBetween("abc", "x", "y")).isEqualTo(null);
        //T12: str contiene la etiqueta open pero no contiene la etiqueta close.
        assertThat(substringsBetween("abc", "a", "y")).isEqualTo(null);
        //T13: str contiene la etiqueta de close pero no contiene la etiqueta de open
        assertThat(substringsBetween("abc", "x", "c")).isEqualTo(null);
        //T14: str contiene las etiquetas de open y close.
        assertThat(substringsBetween("abc", "a", "c")).isEqualTo(new String[]{"b"});
        // T15: str contiene las etiquetas de open y close varias veces. <- falta implementar
        assertThat(StringUtils.substringsBetween("abcabcabc", "a", "c")).isEqualTo(new String[]{"b", "b", "b"});
        //T
        assertThat(substringsBetween("abcabyt byrc", "a", "c")).isEqualTo(new String[]{"b", "bytbyr"});
    }
    //Luego tenemos las pruebas para las etiquetas open y close de diferentes tamaños.
    @Test
    void openAndCloseTagsOfDifferentSizes() {
        //T16: str no contiene ni la etiqueta de open ni la de close.
        assertThat(substringsBetween("aabcc", "xx", "yy")).isEqualTo(null);
        //T17: str contiene la etiqueta open pero no contiene la etiqueta close.
        assertThat(substringsBetween("aabcc", "aa", "yy")).isEqualTo(null);
        //T18: str contiene la etiqueta de close pero no contiene la etiqueta de open.
        assertThat(substringsBetween("aabcc", "xx", "cc")).isEqualTo(null);
        //T19: str contiene las etiquetas de open y close
        assertThat(substringsBetween("aabbcc", "aa", "cc")).isEqualTo(new String[]{"bb"});
        //T20: str contiene las etiquetas de open y close varias veces.
        assertThat(substringsBetween("aabbccaaeecc", "aa", "cc")).isEqualTo(new String[]{"bb", "ee"});
        //assertThat(substringsBetween("a abb ddc ca abbcc", "a a", "c c")).isEqualTo(new String[]{"bb dd"});
    }
    //Finalmente, aquí está la prueba para cuando no hay una subcadena entre las etiquetas de open y
    //close.
    @Test
    void notSubstringBetweenOpenAndCloseTags() {
        //T21: str contiene las etiquetas de open y close sin caracteres entre ellas.
        assertThat(substringsBetween("aabb", "aa", "bb")).isEqualTo(new String[]{""});
    }
    @Test
    void ignoresSpecialCharacters() {
        assertThat(substringsBetween("a*b?c!a@d", "a", "d")).isEqualTo(new String[] { "bca" });
    }
    @Test
    void throwsExceptionWhenOpenOrCloseIsEmpty() {
        assertThrows(InvalidDelimiterException.class, () -> {
            substringsBetween("abc", "", "b");
        });
        assertThrows(InvalidDelimiterException.class, () -> {
            substringsBetween("abc", "a", "");
        });
    }

    //Test para el metodo regexSubstringsBetween()
    @Test
    void regexSimpleCase() {
        assertThat(StringUtils.regexSubstringsBetween("abcd", "a", "d")).isEqualTo(new String[] { "bc" });
    }
    @Test
    void regexManyStrings() {
        assertThat(StringUtils.regexSubstringsBetween("abcdabcdab", "a", "d")).isEqualTo(new String[]
                { "bc", "bc" });
    }
    @Test
    void regexOpenAndCloseTagsThatAreLongerThan1Char() {
        assertThat(StringUtils.regexSubstringsBetween("aabcddaabfddaab", "aa", "dd")).isEqualTo(new
                String[] { "bc", "bf" });
    }
}