package Stack;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ValidParenthesesTest {

    @Test
    public void case_1(){
        String input = "()";
        boolean expected = true;
        boolean actual = ValidParentheses.isValid(input);
        assertEquals(expected, actual);
    }

    @Test
    public void case_2(){
        String input = "([])";
        boolean expected = true;
        boolean actual = ValidParentheses.isValid(input);
        assertEquals(expected, actual);
    }

    @Test
    public void case_3(){
        String input = "([])}";
        boolean expected = false;
        boolean actual = ValidParentheses.isValid(input);
        assertEquals(expected, actual);
    }

}
