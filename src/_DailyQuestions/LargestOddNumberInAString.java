package _DailyQuestions;

/*
    Daily Problem 07.12.2023
    You are given a string num, representing a large integer.
    Return the largest-valued odd integer (as a string) that
    is a non-empty substring of num, or an empty string ""
    if no odd integer exists. A substring is a contiguous
    sequence of characters within a string.
 */

public class LargestOddNumberInAString {

    public static String largestOddNumber(String num) {

        int i = num.length() - 1;
        StringBuilder result = new StringBuilder();

        // find index which is last number is odd
        while (i >= 0) {
            if (num.charAt(i) % 2 != 0)
                break;
            i--;
        }

        // add all numbers until index reached
        for (int j = 0; j <= i; j++) {
            result.append(num.charAt(j));
        }

        return result.toString();
    }


    public static void main(String[] args) {
        largestOddNumber("213");
    }

}
