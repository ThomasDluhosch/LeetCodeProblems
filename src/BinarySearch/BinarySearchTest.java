package BinarySearch;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

    @Test
    public void case_11(){
        int[] input = {-1,3,5,7,8,9};
        int target = 8;
        int expected = 4;
        int actual = BinarySearch.search(input, target);
        assertEquals(expected, actual);
    }

    @Test
    public void case_12(){
        int[] input = {-1,3,5,7,8,9};
        int target = 12;
        int expected = -1;
        int actual = BinarySearch.search(input, target);
        assertEquals(expected, actual);
    }

    @Test
    public void case_13(){
        int[] input = {-1,3,5,7,8,9};
        int target = -1;
        int expected = 0;
        int actual = BinarySearch.search(input, target);
        assertEquals(expected, actual);
    }

    @Test
    public void case_21(){
        int[] input = {-1,3,5,7,8,9};
        int target = 8;
        int expected = 4;
        int actual = BinarySearch2.search(input, target);
        assertEquals(expected, actual);
    }

    @Test
    public void case_22(){
        int[] input = {-1,3,5,7,8,9};
        int target = 12;
        int expected = -1;
        int actual = BinarySearch2.search(input, target);
        assertEquals(expected, actual);
    }

    @Test
    public void case_23(){
        int[] input = {-1,3,5,7,8,9};
        int target = -1;
        int expected = 0;
        int actual = BinarySearch2.search(input, target);
        assertEquals(expected, actual);
    }
}
