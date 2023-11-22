package BinarySearch;

/*
    LeetCode Problem 704
    Given an array of integers nums which is sorted in ascending order,
    and an integer target, write a function to search target in nums.
    If target exists, then return its index. Otherwise, return -1.
    You must write an algorithm with O(log n) runtime complexity.
    -> time complexity: O()
 */

public class BinarySearch {

    public static int search(int[] nums, int target) {
        return binSearch(nums, target, 0, nums.length - 1);
    }

    private static int binSearch(int[] nums, int target, int lo, int hi) {
        if (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // search right half
            if (nums[mid] < target) {
                return binSearch(nums, target, mid + 1, hi);
            }

            // search left half
            if (nums[mid] > target) {
                return binSearch(nums, target, lo, mid - 1);
            }
        }
        return -1;
    }
}