package Arrays_and_Hashing;
import java.util.HashMap;

/*
    LeetCode Problem 1
    Given an array of integers 'nums' and an integer 'target', return
    indices of the two numbers such that they add up to 'target'.
    You may assume that each input would have exactly one solution,
    and you may not use the same element twice.
    You can return the answer in any order.
    -> time complexity for twoSumBF: O(n^2)
    -> time complexity for twoSum: O()
 */

public class TwoSum {

    // twoSum HashMap
    public static int[] twoSum(int[] nums, int target) {

        // complementValue, which index is complement value
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            Integer neededComplement = map.get(nums[i]);
            if(map.containsKey(nums[i])){
                return new int[] {map.get(nums[i]) , i};
            }
            map.put(target - nums[i], i);
        }
        return nums;
    }


    // twoSum Brute Force
    public static int[] twoSumBF(int[] nums, int target) {
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j < nums.length; j++ ){
                if(nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        return new int[]{};
    }
}