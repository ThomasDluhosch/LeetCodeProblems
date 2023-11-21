/*
    LeetCode Problem 217
    Given an integer array 'nums', return 'true' if any value appears at least twice in
    the array, and return 'false' if every element is distinct.
    -> time complexity: O(n)
 */

import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 1 ; i < nums.length ; i++){
            set.add(nums[i-1]);
            if(set.contains(nums[i])){
                return true;
            }
        }
        return false;
    }
}