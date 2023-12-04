package _DailyQuestions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Largest3SameDigitNumberInStringTest {

    @Test
    public void case_1(){
        String input = "6777133339";
        String expected = "777";
        String actual = Largest3SameDigitNumberInString.largestGoodInteger(input);
        assertEquals(expected, actual);
    }

    @Test
    public void case_2(){
        String input = "2300019";
        String expected = "000";
        String actual = Largest3SameDigitNumberInString.largestGoodInteger(input);
        assertEquals(expected, actual);
    }

    @Test
    public void case_3(){
        String input = "42352338";
        String expected = "";
        String actual = Largest3SameDigitNumberInString.largestGoodInteger(input);
        assertEquals(expected, actual);
    }

    @Test
    public void case_4(){
        String input = "3200014888";
        String expected = "888";
        String actual = Largest3SameDigitNumberInString.largestGoodInteger(input);
        assertEquals(expected, actual);
    }




}
