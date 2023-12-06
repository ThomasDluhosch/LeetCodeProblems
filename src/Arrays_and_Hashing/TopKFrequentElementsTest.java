package Arrays_and_Hashing;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertArrayEquals;

public class TopKFrequentElementsTest {

    @Test
    public void case_1(){
        int[] input = {1,1,1,2,2,3};
        int k = 2;
        int[] expected = {1,2};
        int[] actual = TopKFrequentElements.topKFrequent(input, k);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void case_2(){
        int[] input = {1};
        int k = 1;
        int[] expected = {1};
        int[] actual = TopKFrequentElements.topKFrequent(input, k);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void case_3(){
        int[] input = {1,2};
        int k = 2;
        int[] expected = {1,2};
        int[] actual = TopKFrequentElements.topKFrequent(input, k);
        assertArrayEquals(expected, actual);
    }



}
