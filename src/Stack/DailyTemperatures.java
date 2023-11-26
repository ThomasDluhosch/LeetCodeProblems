package Stack;
import java.util.Stack;

/*
    LeetCode Problem 739
    Given an array of integers temperatures represents the daily temperatures,
    return an array answer such that answer[i] is the number of days you have
    to wait after the ith day to get a warmer temperature. If there is no
    future day for which this is possible, keep answer[i] == 0 instead.
 */

public class DailyTemperatures {

    public static int[] dailyTemperatures(int[] temperatures) {

        Stack<Integer> stack = new Stack<>();
        int[] output = new int[temperatures.length];

        for (int i = temperatures.length - 1; i >= 0; i--) {
            while(!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]){
                stack.pop();
            }
            if (!stack.isEmpty()){
                output[i] = stack.peek() - i;
            }
            stack.push(i);
        }

        return output;
    }
}