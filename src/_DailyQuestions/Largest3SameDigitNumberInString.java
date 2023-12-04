package _DailyQuestions;

/*
    DailyProblem 04.12.23 - 2264
    You are given a string num representing a large integer.
    An integer is good if it meets the following conditions:
        - It is a substring of num with length 3.
        - It consists of only one unique digit.
    Return the maximum good integer as a string or an empty
    string "" if no such integer exists.
    Note: A substring is a contiguous sequence of characters
    within a string. There may be leading zeroes in num or
    a good integer.
 */

import java.util.Stack;

public class Largest3SameDigitNumberInString {

    public static String largestGoodInteger(String num) {

        if (num.indexOf("999") != -1) {
            return "999";
        } else if (num.indexOf("888") != -1) {
            return "888";
        } else if (num.indexOf("777") != -1) {
            return "777";
        } else if (num.indexOf("666") != -1) {
            return "666";
        } else if (num.indexOf("555") != -1) {
            return "555";
        } else if (num.indexOf("444") != -1) {
            return "444";
        } else if (num.indexOf("333") != -1) {
            return "333";
        } else if (num.indexOf("222") != -1) {
            return "222";
        } else if (num.indexOf("111") != -1) {
            return "111";
        } else if (num.indexOf("000") != -1) {
            return "000";
        }

        return "";
    }


}
