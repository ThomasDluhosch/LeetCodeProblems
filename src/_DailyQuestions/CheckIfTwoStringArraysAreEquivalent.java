package _DailyQuestions;

/*
    DailyProblem 01.12.23 - 1662
    Given two string arrays word1 and word2, return true if the two arrays
    represent the same string, and false otherwise.
    A string is represented by an array if the array elements concatenated
    in order forms the string.
 */

public class CheckIfTwoStringArraysAreEquivalent {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        String string1 = "";
        String string2 = "";

        for(int i=0; i<word1.length; i++){
            string1 += word1[i];
        }

        for(int i=0; i<word2.length; i++){
            string2 += word2[i];
        }

        return string1.equals(string2);
    }

}
