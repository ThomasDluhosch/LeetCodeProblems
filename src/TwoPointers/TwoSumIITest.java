package TwoPointers;
import Arrays_and_Hashing.TwoSum;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class TwoSumIITest {

    @Test
    public void case_1(){
        int[] input = {2,7,11,15};
        int target = 9;
        int[] expected = {1,2};
        int[] actual = TwoSumII.twoSum(input, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void case_2(){
        int[] input = {2,3,4};
        int target = 6;
        int[] expected = {1,3};
        int[] actual = TwoSum.twoSum(input, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void case_3(){
        int[] input = {-1, 0};
        int target = -1;
        int[] expected = {1,2};
        int[] actual = TwoSum.twoSum(input, target);
        assertArrayEquals(expected, actual);
    }
}
