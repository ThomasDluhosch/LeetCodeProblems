package _DailyQuestions;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CheckIfTwoStringArraysAreEquivalentTest {

    @Test
    public void case_1(){
        String[] input1 = {"ab","c"};
        String[] input2 = {"a","bc"};
        boolean expected = true;
        boolean actual = CheckIfTwoStringArraysAreEquivalent.arrayStringsAreEqual(input1, input2);
        assertEquals(expected, actual);
    }

    @Test
    public void case_2(){
        String[] input1 = {"a","cb"};
        String[] input2 = {"ab","c"};
        boolean expected = false;
        boolean actual = CheckIfTwoStringArraysAreEquivalent.arrayStringsAreEqual(input1, input2);
        assertEquals(expected, actual);
    }

    @Test
    public void case_3(){
        String[] input1 = {"abc","d","defg"};
        String[] input2 = {"abcddefg"};
        boolean expected = true;
        boolean actual = CheckIfTwoStringArraysAreEquivalent.arrayStringsAreEqual(input1, input2);
        assertEquals(expected, actual);
    }

}