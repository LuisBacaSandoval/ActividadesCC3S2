# Pruebas basadas en especificaciones

## Ejercicio 1

**Pregunta**

Escribe el código de prueba y considera las entradas str = "axcaycazc", open = "a" y close = "c" y explica lo que hace el código anterior.

```java
    public static  final String[] EMPTY_STRING_ARRAY = new String[0];

    public static boolean isEmpty(final CharSequence cs) {
        return cs == null || cs.isEmpty();
    }

    public static String[] substringsBetween(final String str, final String open, final String close) {
        if (str == null || isEmpty(open) || isEmpty(close)) {
            return null;
        }
        final int strLen = str.length();
        if (strLen == 0) {
            return EMPTY_STRING_ARRAY;
        }
        final int closeLen = close.length();
        final int openLen = open.length();
        final List<String> list = new ArrayList<>();
        int pos = 0;
        while (pos < strLen - closeLen) {
            int start = str.indexOf(open, pos);
            if (start < 0) {
                break;
            }
            start += openLen;
            final int end = str.indexOf(close, start);
            if (end < 0) {
                break;
            }
            list.add(str.substring(start, end));
            pos = end + closeLen;
        }
        if (list.isEmpty()) {
            return null;
        }
        return list.toArray(EMPTY_STRING_ARRAY);
    }
```

**Respuesta**

El código es una implementación del método `substringBetween()` este recibe una cadena de texto y dos caracteres, `open` y `close`,
y devuelve un array de cadenas de texto que están entre `open` y `close` en la cadena de texto `str`.
El método recorre la cadena de texto y busca las ocurrencias de `open` y `close` para extraer las subcadenas que están entre ellos.

## Ejercicio 2

**Pregunta**

Revisa los requisitos una vez más y escribe todos los casos de prueba que se te ocurran.
El formato no importa, puede ser algo así como "todos los parámetros son nulos". Cuando hayas
terminado con esta nota, compara tu conjunto de pruebas inicial con el que estamos a punto de
derivar.

**Respuesta**

Casos de prueba

- Caso 1: un substring dentro de la cadena
- Caso 2: más de un substring dentro de la cadena
- Caso 3: cadena con tags de inicio y fin de longitud > 1

```java
    @Test
    void simpleCase() {
        assertThat(stringUtils.substringsBetween("abcd", "a", "d")).isEqualTo(new String[] { "bc" });
    }

    @Test
    void manyStrings() {
        assertThat(stringUtils.substringsBetween("abcdabcdab", "a", "d")).isEqualTo(new String[] { "bc", "bc" });
    }
    
    @Test
    void openAndCloseTagsThatAreLongerThan1Char() {
        assertThat(stringUtils.substringsBetween("aabcddaabfddaab", "aa", "dd")).isEqualTo(new String[] { "bc", "bf" });
    }
```

## Ejercicio 3

**Pregunta**

Escribe un código de prueba llamado stringUtilsExploracionTest.java que albergue el
código anterior.

## Ejercicio 4

**Pregunta**

¿En nuestro ejemplo cuál es el número de pruebas?

**Respuesta**

```
  En este caso, el número de pruebas necesarias es 4.
  1. longitud de str = 1 y este coincide con open
  2. longitud de str = 1 y este coincide con close
  3. longitud de str > 1, longitud de open = 1 y longitud de close = 1
  4. longitud de str > 1, longitud de open > 1 y longitud de close > 1
```

## Ejercicio 5

**Pregunta**

¿Encontramos más casos donde se pueda simplificar el número de pruebas?

**Respuesta**

**Cadena vacia o nula:**

- str es nulo.
- str está vacío.
- open es nulo.
- open está vacío.
- close es nulo.
- close está vacío.

**Cadena de longitud 1:**

- El carácter único en str coincide con la etiqueta open.
- El carácter único en str coincide con la etiqueta de close.
- El carácter único en str no coincide ni con la etiqueta de open ni con la de close.
- El carácter único en str coincide con las etiquetas de open y close.

**Cadena de longitud > 1, longitud de open = 1, longitud de close = 1:**

- str no contiene ni la etiqueta de open ni la de close.
- str contiene la etiqueta open pero no contiene la etiqueta close.
- str contiene la etiqueta de close pero no contiene la etiqueta de open.
- str contiene las etiquetas de open y close.
- str contiene las etiquetas de open y close varias veces.

**Cadena de longitud > 1, longitud de open > 1, longitud de close > 1:**

- str no contiene ni la etiqueta de open ni la de close.
- str contiene la etiqueta open pero no contiene la etiqueta close.
- str contiene la etiqueta de close pero no contiene la etiqueta de open.
- str contiene las etiquetas de open y close.
- str contiene las etiquetas de open y close varias veces.

**La prueba para el límite:**

- str contiene las etiquetas de open y close sin caracteres entre ellas.

## Ejercicio 6

**Pregunta**

Escribe un archivo StringUtilsTest.java y completa el código anterior.

**Respuesta**

```java
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
            assertThat(substringsBetween("abc", "", "b")).isEqualTo(null);
    }
    @Test
    void closeIsNullOrEmpty() {
            //T5: close es nulo
            assertThat(substringsBetween("abc", "a", null)).isEqualTo(null);
            //T6: close está vacío.
            assertThat(substringsBetween("abc", "a", "")).isEqualTo(null);
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
            assertThat(substringsBetween("abc", "a", "c")).isEqualTo(new String[]{"b", "b"});
            // T15: str contiene las etiquetas de open y close varias veces. <- falta implementar
            assertThat(StringUtils.substringsBetween("abcabcabc", "a", "c")).isEqualTo(new String[]{"b", "b", "b"});
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
    }
//Finalmente, aquí está la prueba para cuando no hay una subcadena entre las etiquetas de open y
//close.
    @Test
    void notSubstringBetweenOpenAndCloseTags() {
            //T21: str contiene las etiquetas de open y close sin caracteres entre ellas.
            assertThat(substringsBetween("aabb", "aa", "bb")).isEqualTo(new String[]{""});
    }
```

No hemos terminado. Aunque hemos escrito 23 pruebas, no hemos probado todas las combinaciones
posibles, ademas podemos realizar mejoras sobre el código para validar errores o validar las salidas de
manera correcta.

## Ejercicio 7

**Pregunta**

Modifica el método substringsBetween para manejar casos especiales adicionales y asegurar que
todas las pruebas existentes pasen.

Instrucciones:

1. Modifica el método substringsBetween para que si la cadena str contiene caracteres especiales
(como *, ?, !, etc.), los ignore y solo considere letras y números para la búsqueda  de subcadenas.
2. Asegúrate de que todas las pruebas existentes aún pasen.
3. Escribe nuevas pruebas que validen esta funcionalidad

:white_check_mark: **Respuesta**

Clase `StringUtils` con el método `substringsBetween()` modificado

```java
public static String[] substringsBetween(final String str, final String open, final String close) {
    if (str == null || isEmpty(open) || isEmpty(close)) {
        return null;
    }
    final String sanitizedStr = str.replaceAll("[^a-zA-Z0-9]", "");
    final int strLen = sanitizedStr.length();
    if (strLen == 0) {
        return EMPTY_STRING_ARRAY;
    }
    final int closeLen = close.length();
    final int openLen = open.length();
    final List<String> list = new ArrayList<>();
    int pos = 0;
    while (pos < strLen - closeLen) {
        int start = sanitizedStr.indexOf(open, pos);
        if (start < 0) {
            break;
        }
        start += openLen;
        final int end = sanitizedStr.indexOf(close, start);
        if (end < 0) {
            break;
        }
        list.add(sanitizedStr.substring(start, end));
        pos = end + closeLen;
    }
    if (list.isEmpty()) {
        return null;
    }
    return list.toArray(EMPTY_STRING_ARRAY);
}
```

Pruebas para validar la funcionalidad

```java
    @Test
    void ignoresSpecialCharacters() {
        // T24: str contiene caracteres especiales.
        Assertions.assertThat(stringUtils.substringsBetween("a*b?c!a@d", "a", "d")).isEqualTo(new String[] { "bca" });
    }
```

## Ejercicio 8

**Pregunta**

Implementa excepciones personalizadas para manejar casos específicos de errores en el método
substringsBetween.

**Respuesta**

Clase `InvalidDelimiterException`

```java
public class InvalidDelimiterException extends RuntimeException {
    public InvalidDelimiterException(String message) {
        super(message);
    }
}
```

Clase `StringUtils` con el método `substringsBetween()` modificado

```java
    public static String[] substringsBetween(final String str, final String open, final String close) {
        if (str == null) {
            return null;
        }
        if (isEmpty(open) || isEmpty(close)) {
            throw new InvalidDelimiterException("Open or close delimiter cannot be empty");
        }
        final String sanitizedStr = str.replaceAll("[^a-zA-Z0-9]", "");
        final int strLen = sanitizedStr.length();
        if (strLen == 0) {
            return EMPTY_STRING_ARRAY;
        }
        final int closeLen = close.length();
        final int openLen = open.length();
        final List<String> list = new ArrayList<>();
        int pos = 0;
        while (pos < strLen - closeLen) {
            int start = sanitizedStr.indexOf(open, pos);
            if (start < 0) {
                break;
            }
            start += openLen;
            final int end = sanitizedStr.indexOf(close, start);
            if (end < 0) {
                break;
            }
            list.add(sanitizedStr.substring(start, end));
            pos = end + closeLen;
        }
        if (list.isEmpty()) {
            return null;
        }
        return list.toArray(EMPTY_STRING_ARRAY);
    }
```

Pruebas para validar la excepción

```java
    @Test
    void openOrCloseDelimiterCannotBeEmpty() {
        // T25: open es nulo.
        Assertions.assertThatThrownBy(() -> stringUtils.substringsBetween("abc", null, "b"))
                .isInstanceOf(InvalidDelimiterException.class)
                .hasMessage("Open or close delimiter cannot be empty");
        // T26: open está vacío.
        Assertions.assertThatThrownBy(() -> stringUtils.substringsBetween("abc", "", "c"))
                .isInstanceOf(InvalidDelimiterException.class)
                .hasMessage("Open or close delimiter cannot be empty");
        // T27: close es nulo.
        Assertions.assertThatThrownBy(() -> stringUtils.substringsBetween("abc", "a", null))
                .isInstanceOf(InvalidDelimiterException.class)
                .hasMessage("Open or close delimiter cannot be empty");
        // T28: close está vacío.
        Assertions.assertThatThrownBy(() -> stringUtils.substringsBetween("abc", "a", ""))
                .isInstanceOf(InvalidDelimiterException.class)
                .hasMessage("Open or close delimiter cannot be empty");
    }
```

## Ejercicio 9: Implementación de un método alternativo

**Pregunta**

Implementa un método alternativo que utilice expresiones regulares para encontrar subcadenas
entre dos delimitadores.

**Respuesta**

Clase `StringUtils` con el método `regexSubstringsBetween()`

```java
    public static String[] regexSubstringsBetween(final String str, final String open, final String close) {
        if (str == null || isEmpty(open) || isEmpty(close)) {
            return null;
        }
        final String regex = Pattern.quote(open) + "(.*?)" + Pattern.quote(close);
        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(str);
        final List<String> list = new ArrayList<>();
        while (matcher.find()) {
            list.add(matcher.group(1));
        }
        if (list.isEmpty()) {
            return null;
        }
    return list.toArray(EMPTY_STRING_ARRAY);
    }
```

```java
    @Test
    void regexSimpleCase() {
        assertThat(stringUtils.regexSubstringsBetween("abcd", "a", "d")).isEqualTo(new String[] { "bc" });
    }
    
    @Test
    void regexManyStrings() {
        assertThat(stringUtils.regexSubstringsBetween("abcdabcdab", "a", "d")).isEqualTo(new String[]
                { "bc", "bc" });
    }
    
    @Test
    void regexOpenAndCloseTagsThatAreLongerThan1Char() {
        assertThat(stringUtils.regexSubstringsBetween("aabcddaabfddaab", "aa", "dd")).isEqualTo(new
                String[] { "bc", "bf" });
    }
```

## Ejercicio 10: Optimización del método original

**Pregunta**

Optimiza el método substringsBetween para mejorar su eficiencia en términos de tiempo y espacio.

**Respuesta**

Clase `StringUtils` con el método `substringsBetween()` optimizado

```java
    public static String[] substringsBetween(final String str, final String open, final String close) {
        if (str == null) {
            return null;
        }
        if (isEmpty(open) || isEmpty(close)) {
            throw new InvalidDelimiterException("Open or close delimiter cannot be empty");
        }
        final String sanitizedStr = str.replaceAll("[^a-zA-Z0-9]", "");
        final int strLen = sanitizedStr.length();
        if (strLen == 0) {
            return EMPTY_STRING_ARRAY;
        }
        final int closeLen = close.length();
        final int openLen = open.length();
        final List<String> list = new ArrayList<>();
        int pos = 0;
        while (pos < strLen - closeLen) {
            int start = sanitizedStr.indexOf(open, pos);
            if (start < 0) {
                break;
            }
            start += openLen;
            final int end = sanitizedStr.indexOf(close, start);
            if (end < 0) {
                break;
            }
            list.add(sanitizedStr.substring(start, end));
            pos = end + closeLen;
        }
        if (list.isEmpty()) {
            return null;
        }
        return list.toArray(new String[list.size()]);
    }
```
