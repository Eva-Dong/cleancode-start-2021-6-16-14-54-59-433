package com.tw.academy.basic.$4_naming.practiceTwo;

public class PigLatin {

    private static final String SUFFIX = "ay";
    public static final String SPACE_SEPARATOR = " ";

    public static String pigIt(String sentence) {
        String[] punctuation = {".",",","-",":",";","!","?"};
        String[] word = sentence.split(SPACE_SEPARATOR);
        char firstLetter;
        boolean flag = true;

        for (int i = 0; i < word.length; i++){
            for (String punctuationChar : punctuation) {
                if (word[i].contains(punctuationChar)) {
                    flag = false;
                    break;
                }
            }

            if (flag){
                firstLetter = word[i].charAt(0);
                word[i] = word[i].substring(1);
                word[i] = word[i].replace(word[i], word[i] + firstLetter + SUFFIX);
            }
            flag = true;
        }

        return String.join(SPACE_SEPARATOR, word);
    }
}
