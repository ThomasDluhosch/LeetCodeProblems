package Arrays_and_Hashing;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ProductOfArrayExceptSelfTest {

    @Test
    public void case_1() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        int[] actual = ProductOfArrayExceptSelf.productExceptSelf(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void case_2() {
        int[] input = {-1, 1, 0, -3, 3};
        int[] expected = {0, 0, 9, 0, 0};
        int[] actual = ProductOfArrayExceptSelf.productExceptSelf(input);
        assertArrayEquals(expected, actual);
    }

}
