import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ContainsDuplicateTest {

    @Test
    public void case_1(){
        int[] input = {1,2,3,1};
        boolean expected = true;
        boolean actual = ContainsDuplicate.containsDuplicate(input);
        assertEquals(expected, actual);
    }

    @Test
    public void case_2(){
        int[] input = {1,2,3,4};
        boolean expected = false;
        boolean actual = ContainsDuplicate.containsDuplicate(input);
        assertEquals(expected, actual);
    }

    @Test
    public void case_3(){
        int[] input = {1,1,1,3,3,4,3,2,4,2};
        boolean expected = true;
        boolean actual = ContainsDuplicate.containsDuplicate(input);
        assertEquals(expected, actual);
    }

}
