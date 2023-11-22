package Stack;
import java.util.Stack;

/*
    Given a string s containing just the characters
    '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
    An input string is valid if:
    - Open brackets must be closed by the same type of brackets.
    - Open brackets must be closed in the correct order.
    - Every close bracket has a corresponding open bracket of the same type.
    -> time complexity: O(n)
 */

public class ValidParentheses {

    public static boolean isValid(String s) {

        if(s.length() %2 != 0){
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){ stack.push(')'); }
            else if(s.charAt(i) == '['){ stack.push(']'); }
            else if(s.charAt(i) == '{'){ stack.push('}'); }
            else if(stack.isEmpty() || stack.pop() != s.charAt(i)){ return false; }
        }
        return stack.isEmpty();
    }
}