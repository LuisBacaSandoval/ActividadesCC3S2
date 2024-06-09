package org.example.pruebasespecificacion;

import static org.junit.jupiter.api.Assertions.*;

import org.example.pruebasespecificacion.InvalidDelimiterException;
import org.example.pruebasespecificacion.StringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    StringUtils stringUtils;

    //Ejercicio 1: Prueba para la cadena: "axcaycazc"
    //inicio de la subcadena: a
    //fin de la subcadena: b
    @Test
    public void testValoresDeEntradaValidos1(){
        String[] subStrings = StringUtils.substringsBetween("axcaycazc", "a", "c");
        assertEquals("x", subStrings[0], "Se esperaba la subcadena: x");//se espera la subcadena "x"
        assertEquals("y", subStrings[1], "Se esperaba la subcadena: y");//se espera la subcadena "y"
        assertEquals("z", subStrings[2], "Se esperaba la subcadena: z");//se espera la subcadena "z"
    }

    //Ejercicio 2:
    //Pasamos la cadena "abcd" con open: a y close: d, se espera el arreglo {"bc"}
    @Test
    public void simpleCase() {
        assertThat(stringUtils.substringsBetween("abcd", "a", "d")).isEqualTo(new String[] { "bc" });
    }

    //Pasamos la cadena "abcdabcdab" con open: a y close: d, se espera el arreglo {"bc", "bc"}
    @Test
    void manyStrings() {
        assertThat(stringUtils.substringsBetween("abcdabcdab", "a", "d")).isEqualTo(new String[] { "bc",
                "bc" });
    }

    //Pasamos la cadena "aabcddaabfddaab" con open: aa y close: dd, se espera el arreglo {"bc", "bf"}
    @Test
    void openAndCloseTagsThatAreLongerThan1Char() {
        assertThat(stringUtils.substringsBetween("aabcddaabfddaab", "aa", "dd")).isEqualTo(new String[]
                { "bc", "bf" });
    }

    /* Pruebas para:
    • T1: str es nulo.
    • T2: str está vacío.
    • T3: open es nulo.
    • T4: open está vacío.
    • T5: close es nulo.
    • T6: close está vacío.
    */
    @Test
    void strIsNullOrEmpty() {
        assertThat(stringUtils.substringsBetween(null, "a", "b")).isEqualTo(null);
        assertThat(stringUtils.substringsBetween("", "a", "b")).isEqualTo(new String[]{});
    }

    @Test
    void throwsExceptionWhenOpenOrCloseIsEmpty() {
        assertThrows(InvalidDelimiterException.class, () -> {
            stringUtils.substringsBetween("abc", "", "b");
        });
        assertThrows(InvalidDelimiterException.class, () -> {
            stringUtils.substringsBetween("abc", "a", "");
        });
    }
    //Se comentó el siguiente código porque ahora se lanza una excepción y ya no retorna null
    /*@Test
    void openIsNullOrEmpty() {
        assertThat(stringUtils.substringsBetween("abc", null, "b")).isEqualTo(null);
        assertThat(stringUtils.substringsBetween("abc", "a", "")).isEqualTo(null);
    }
    @Test
    void closeIsNullOrEmpty() {
        assertThat(stringUtils.substringsBetween("abc", "a", null)).isEqualTo(null);
        assertThat(stringUtils.substringsBetween("abc", "a", "")).isEqualTo(null);
    }*/


    /* Pruebas para:
    • T7: el carácter único en str coincide con la etiqueta open.
    • T8: El carácter único en str coincide con la etiqueta de close.
    • T9: El carácter único en str no coincide ni con la etiqueta de open ni con la de close.
    • T10: el carácter único en str coincide con las etiquetas de open y close
    */
    @Test
    void strOfLength1() {
        assertThat(stringUtils.substringsBetween("a", "a", "b")).isEqualTo(null);
        assertThat(stringUtils.substringsBetween("a", "b", "a")).isEqualTo(null);
        assertThat(stringUtils.substringsBetween("a", "b", "b")).isEqualTo(null);
        assertThat(stringUtils.substringsBetween("a", "a", "a")).isEqualTo(null);
    }

    /* Pruebas para:
    • T11: str no contiene ni la etiqueta de open ni la de close.
    • T12: str contiene la etiqueta open pero no contiene la etiqueta close.
    • T13: str contiene la etiqueta de close pero no contiene la etiqueta de open.
    • T14: str contiene las etiquetas de open y close.
    • T15: str contiene las etiquetas de open y close varias veces.
     */
    @Test
    void openAndCloseOfLength1() {
        assertThat(stringUtils.substringsBetween("abc", "x", "y")).isEqualTo(null);
        assertThat(stringUtils.substringsBetween("abc", "a", "y")).isEqualTo(null);
        assertThat(stringUtils.substringsBetween("abc", "x", "c")).isEqualTo(null);
        assertThat(stringUtils.substringsBetween("abc", "a", "c")).isEqualTo(new String[]{"b"});
        assertThat(stringUtils.substringsBetween("abcabyt byrc", "a", "c")).isEqualTo(new String[]{"b", "bytbyr"});
    }

    /* Pruebas para:
    • T16: str no contiene ni la etiqueta de open ni la de close.
    • T17: str contiene la etiqueta open pero no contiene la etiqueta close.
    • T18: str contiene la etiqueta de close pero no contiene la etiqueta de open.
    • T19: str contiene las etiquetas de open y close.
    • T20: str contiene las etiquetas de open y close varias veces.
     */
    @Test
    void openAndCloseTagsOfDifferentSizes() {
        assertThat(stringUtils.substringsBetween("aabcc", "xx", "yy")).isEqualTo(null);
        assertThat(stringUtils.substringsBetween("aabcc", "aa", "yy")).isEqualTo(null);
        assertThat(stringUtils.substringsBetween("aabcc", "xx", "cc")).isEqualTo(null);
        assertThat(stringUtils.substringsBetween("aabbcc", "aa", "cc")).isEqualTo(new String[]{"bb"});
        assertThat(stringUtils.substringsBetween("aabbccaaeecc", "aa", "cc")).isEqualTo(new String[]{"bb", "ee"});
        //assertThat(stringUtils.substringsBetween("a abb ddc ca abbcc", "a a", "c c")).isEqualTo(new String[]{"bb dd"});
    }

    /* Pruebas para:
    • T21: str contiene las etiquetas de open y close sin caracteres entre ellas.
     */
    @Test
    void notSubstringBetweenOpenAndCloseTags() {
        assertThat(stringUtils.substringsBetween("aabb", "aa", "bb")).isEqualTo(new String[]{""});
    }
    /* Pruebas para:
    • T22: str contiene caracteres especiales.
     */
    @Test
    void ignoresSpecialCharacters() {
        assertThat(stringUtils.substringsBetween("a*b?c!a@d", "a", "d")).isEqualTo(new String[] { "bca" });
    }


}