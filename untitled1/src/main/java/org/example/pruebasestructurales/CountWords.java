package org.example.pruebasestructurales;

import java.util.regex.Pattern;

public class CountWords {
    private static final Pattern LETTER_PATTERN = Pattern.compile("[a-zA-Z]");

    public int count(String str) {
        int words = 0;
        char last = ' ';
        for (int i = 0; i < str.length(); i++) { // 1
            if (!isLetter(str.charAt(i)) && (last == 's' || last == 'r')) { // 2
                words++;
            }
            last = str.charAt(i); // 3
        }
        if (last == 'r' || last == 's') {
            words++;
        }
        return words;
    }

    private boolean isLetter(char c) {

        return LETTER_PATTERN.matcher(String.valueOf(c)).matches();
    }
}
