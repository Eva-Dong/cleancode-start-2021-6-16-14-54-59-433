package com.tw.academy.basic.$4_naming.practiceOne;

public class MorseCodeDecoder {

    public static final String REGEX_TWO_AND_MORE_THAN_SPACE = "\\s{2,}";
    public static final String NULL = "null";
    public static final String CODE_SEPARATOR = " ";

    public static String decode(String input) {
        String[] morseCodes = input.split(REGEX_TWO_AND_MORE_THAN_SPACE);
        StringBuilder decodedMorseCode = new StringBuilder();
        for (String morseCode : morseCodes) {
            String [] letters = morseCode.split(CODE_SEPARATOR);
            for (String letter: letters) {
                decodedMorseCode.append(MorseCode.get(letter));
            }
            decodedMorseCode.append(CODE_SEPARATOR);
        }
        return decodedMorseCode.toString().replaceAll(NULL, "").trim();
    }
}
