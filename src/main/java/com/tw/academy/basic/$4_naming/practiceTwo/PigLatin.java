package com.tw.academy.basic.$4_naming.practiceTwo;

public class PigLatin {
    //Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
    private static final String SUFFIX = "ay";
    public static String pigIt(String word) {
        String[] markArrays = {".",",","-",":",";","!","?"};
        String[] wordArrays = word.split(" ");
        char firstWord;
        boolean flag = true;

        for (int i = 0; i < wordArrays.length; i++){
            for (String markArray : markArrays) {
                if (wordArrays[i].contains(markArray)) {
                    flag = false;
                    break;
                }
            }

            if (flag){
                firstWord = wordArrays[i].charAt(0);
                wordArrays[i] = wordArrays[i].substring(1);
                wordArrays[i] = wordArrays[i].replace(wordArrays[i], wordArrays[i] + firstWord + SUFFIX);
            }
            flag = true;
        }

        return String.join(" ", wordArrays);
    }
}
