package Stack;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class DailyTemperaturesTest {

    @Test
    public void case_1(){
        int[] input = {73,74,75,71,69,72,76,73};
        int[] expected = {1,1,4,2,1,1,0,0};
        int[] actual = DailyTemperatures.dailyTemperatures(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void case_2(){
        int[] input = {30,40,50,60};
        int[] expected = {1,1,1,0};
        int[] actual = DailyTemperatures.dailyTemperatures(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void case_3(){
        int[] input = {30,60,90};
        int[] expected = {1,1,0};
        int[] actual = DailyTemperatures.dailyTemperatures(input);
        assertArrayEquals(expected, actual);
    }

}
