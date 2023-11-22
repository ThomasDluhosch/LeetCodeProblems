package Arrays_and_Hashing;
import java.util.HashMap;

/*
    LeetCode Problem 242
    Given two strings 's' and 't', return 'true' if 't' is an anagram of 's', and 'false' otherwise.
    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
    typically using all the original letters exectly once.
    -> time complexity: O(2n)
 */

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.isEmpty()) {
                map.put(s.charAt(i), 1);
            } else if (map.containsKey(s.charAt(i))) {
                map.replace(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (!map.containsKey(t.charAt(i)))
                return false;

            if (map.get(t.charAt(i)) > 1) {
                map.replace(t.charAt(i), map.get(t.charAt(i)) - 1);
            } else {
                map.remove(t.charAt(i));
            }
        }

        return true;
    }
}
