package Arrays_and_Hashing;

/*
    Problem 238
    Given an integer array nums, return an array answer
    such that answer[i] is equal to the product of all
    the elements of nums except nums[i].
    The product of any prefix or suffix of nums is guaranteed
    to fit in a 32-bit integer.
    You must write an algorithm that runs in O(n) time and
    without using the division operation.
 */

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    // TODO: 06.12.2023


    //idea behind this is to first calc the prefix and than the suffix of the array
    public static int[] productExceptSelf(int[] nums) {

        int length = nums.length;
        int[] result = new int[length];
        Arrays.fill(result, 1);

        int currentElement = 1;

        for (int i = 0; i < length; i++) {
            result[i] *= currentElement;
            currentElement *= nums[i];
        }

        currentElement = 1;

        for (int i = length - 1; i >= 0; i--) {
            result[i] *= currentElement;
            currentElement *= nums[i];

            System.out.println(result[i]);
        }

        return result;
    }


    public static int[] productExceptSelfBF(int[] nums) {

        int length = nums.length;
        int[] result = new int[length];

        Arrays.fill(result, 1);

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i != j) {
                    result[i] *= nums[j];
                }
            }
        }

        return result;
    }

}
