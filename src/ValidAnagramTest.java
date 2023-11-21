import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidAnagramTest {

    @Test
    public void case_1(){
        String input1 = "anagram";
        String input2 = "nagaram";
        boolean expected = true;
        boolean actual = ValidAnagram.isAnagram(input1, input2);
        assertEquals(expected, actual);
        System.out.println("input1: " +input1 +" - input2: " +input2 +" - expected value: " +expected +" - actual value: " +actual);
    }

    @Test
    public void case_2(){
        String input1 = "cat";
        String input2 = "ram";
        boolean expected = false;
        boolean actual = ValidAnagram.isAnagram(input1, input2);
        assertEquals(expected, actual);
        System.out.println("input1: " +input1 +" - input2: " +input2 +" - expected value: " +expected +" - actual value: " +actual);
    }

    @Test
    public void case_3(){
        String input1 = "abc";
        String input2 = "abc";
        boolean expected = true;
        boolean actual = ValidAnagram.isAnagram(input1, input2);
        assertEquals(expected, actual);
        System.out.println("input1: " +input1 +" - input2: " +input2 +" - expected value: " +expected +" - actual value: " +actual);
    }


}
