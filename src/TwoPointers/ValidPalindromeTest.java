package TwoPointers;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ValidPalindromeTest {

    @Test
    public void case_1(){
        String input = "abccba";
        boolean expected = true;
        boolean actual = ValidPalindrome.isPalindrome(input);
        assertEquals(expected, actual);
    }

    @Test
    public void case_2(){
        String input = "Hier steht kein Palindrom, oder doch?";
        boolean expected = false;
        boolean actual = ValidPalindrome.isPalindrome(input);
        assertEquals(expected, actual);
    }

    @Test
    public void case_3(){
        String input = "A man, a plan, a canal: Panama";
        boolean expected = true;
        boolean actual = ValidPalindrome.isPalindrome(input);
        assertEquals(expected, actual);
    }

    @Test
    public void case_4(){
        String input = " ";
        boolean expected = true;
        boolean actual = ValidPalindrome.isPalindrome(input);
        assertEquals(expected, actual);
    }

}
