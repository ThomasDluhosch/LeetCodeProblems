import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TwoSumTest {

    @Test
    public void case_1(){
        int[] input = {2,7,11,15};
        int target = 9;
        int[] expected = {0,1};
        int[] actual = TwoSum.twoSum(input, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void case_2(){
        int[] input = {3,2,4};
        int target = 6;
        int[] expected = {1,2};
        int[] actual = TwoSum.twoSum(input, target);
        assertArrayEquals(expected, actual);
    }
}
