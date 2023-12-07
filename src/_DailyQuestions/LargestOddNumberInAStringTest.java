package _DailyQuestions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestOddNumberInAStringTest {

    @Test
    public void case_1() {
        String input = "52";
        String expected = "5";
        String actual = LargestOddNumberInAString.largestOddNumber(input);
        assertEquals(expected, actual);
    }

    @Test
    public void case_2() {
        String input = "4206";
        String expected = "";
        String actual = LargestOddNumberInAString.largestOddNumber(input);
        assertEquals(expected, actual);
    }

    @Test
    public void case_3() {
        String input = "35427";
        String expected = "35427";
        String actual = LargestOddNumberInAString.largestOddNumber(input);
        assertEquals(expected, actual);
    }

}
