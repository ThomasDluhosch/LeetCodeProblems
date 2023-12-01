package SlidingWindow;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BestTimeToBuyAndSellStockTest {

    @Test
    public void case_1(){
        int[] input = {7,1,5,3,6,4};
        int expected = 5;
        int actual = BestTimeToBuyAndSellStock.maxProfit(input);
        assertEquals(expected, actual);
    }

    @Test
    public void case_2(){
        int[] input = {7,6,4,3,1};
        int expected = 0;
        int actual = BestTimeToBuyAndSellStock.maxProfit(input);
        assertEquals(expected, actual);
    }

    @Test
    public void case_3(){
        int[] input = {2,4,1};
        int expected = 2;
        int actual = BestTimeToBuyAndSellStock.maxProfit(input);
        assertEquals(expected, actual);
    }

    @Test
    public void case_4(){
        int[] input = {2,1,2,1,0,1,2};
        int expected = 2;
        int actual = BestTimeToBuyAndSellStock.maxProfit(input);
        assertEquals(expected, actual);
    }

}
