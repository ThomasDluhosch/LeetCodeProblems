package Arrays_and_Hashing;
import java.util.HashMap;

/*
    LeetCode Problem 347
    Given an integer array 'nums' and an integer 'k', return the 'k' most
    frequent elements. You may return the answer in any order.
 */

public class TopKFrequentElements {

    public static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ret = new int[10];
        int index = 0;

        for (int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) +1);
            } else{
                map.put(nums[i], 1);
            }
        }



        return ret;

    }
}