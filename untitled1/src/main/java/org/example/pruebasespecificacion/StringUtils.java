package org.example.pruebasespecificacion;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {
    private static final String[] EMPTY_STRING_ARRAY = new String[0];

    public static String[] substringsBetween(final String str, final String open, final String close) {
        if (str == null) {//Si str es null, open u close son vacias retorna null
            return null;
        }
        if (isEmpty(open) || isEmpty(close)) {
            throw new InvalidDelimiterException("Open or close delimiter cannot be empty");
        }
        final String sanitizedStr = str.replaceAll("[^a-zA-Z0-9]", "");
        final int strLen = sanitizedStr.length();//longitud de la cadena que se analiza
        if (strLen == 0) {//si la longitud de str es 0, retorna un arreglo vacio
            return EMPTY_STRING_ARRAY;
        }
        final int closeLen = close.length();//longitud de la subcadena final
        final int openLen = open.length();//longitud de la subcadena inicial
        final List<String> list = new ArrayList<>();//arreglo que almacenara todas las subcadenas
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

    private static Boolean isEmpty(String cadena){
        if (cadena==null){
            return true;
        }
        return cadena.isEmpty();
    }
}
