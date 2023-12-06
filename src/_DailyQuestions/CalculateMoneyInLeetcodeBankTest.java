package _DailyQuestions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculateMoneyInLeetcodeBankTest {

    @Test
    public void case_1(){
        int input = 4;
        int expected = 10;
        int actual = CalculateMoneyInLeetcodeBank.totalMoney(input);
        assertEquals(expected, actual);
    }

    @Test
    public void case_2(){
        int input = 10;
        int expected = 37;
        int actual = CalculateMoneyInLeetcodeBank.totalMoney(input);
        assertEquals(expected, actual);
    }

    @Test
    public void case_3(){
        int input = 20;
        int expected = 96;
        int actual = CalculateMoneyInLeetcodeBank.totalMoney(input);
        assertEquals(expected, actual);
    }
}
