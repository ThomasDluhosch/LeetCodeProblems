package TwoPointers;

/*
    LeetCode Problem 125
    A phrase is a palindrome if, after converting all uppercase letters
    into lowercase letters and removing all non-alphanumeric characters,
    it reads the same forward and backward. Alphanumeric characters
    include letters and numbers.
    Given a string "s", return "true" if it is a palindrome, or "false" otherwise.
    -> time complexity: O(n)
 */

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {

        String toCheck = s.replaceAll("[^a-zA-Z0-9]", "");
        toCheck = toCheck.toLowerCase();
        int j= toCheck.length();

        for(int i = 0; i < toCheck.length()/2; i++){
            j--;
            if(!(toCheck.charAt(i) == toCheck.charAt(j))){
                return false;
            }
        }
        return true;
    }
}