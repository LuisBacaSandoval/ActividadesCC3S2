package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringUtilsExplorationTest {

    /*
    * al ingresar la cadena abcd, el metodo substringsBetween() debe devolver el array ['bc']
    */
    @Test
    void simpleCase() {
        assertThat(StringUtils.substringsBetween("abcd", "a", "d")).isEqualTo(new String[] { "bc" });
    }
    /*
     * al ingresar la cadena abcdabcdab, el metodo substringsBetween() debe devolver el array ["bc", "bc"]
     */
    @Test
    void manyStrings() {
        assertThat(StringUtils.substringsBetween("abcdabcdab", "a", "d")).isEqualTo(new String[] { "bc",
                "bc" });
    }
    /*
     * al ingresar la cadena aabcddaabfddaab, el metodo substringsBetween() debe devolver el array ["bc", "bf"]
     */
    @Test
    void openAndCloseTagsThatAreLongerThan1Char() {
        assertThat(StringUtils.substringsBetween("aabcddaabfddaab", "aa", "dd")).isEqualTo(new String[]
                { "bc", "bf" });
    }

}