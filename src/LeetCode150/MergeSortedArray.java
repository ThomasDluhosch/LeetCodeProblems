package LeetCode150;

import java.util.Arrays;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int ptr1 = 0;
        int ptr2 = 0;

        for (int i = 0; i < n + m -1; i++) {

            if (ptr1 == m)

            if (nums1[ptr1] <= nums2[ptr2]) {
                ptr1++;
            }

            if (nums1[ptr1] > nums2[ptr2]) {
                exch(nums1, ptr1, nums2, ptr2);

            }

        }


    }


    private static void exch(int[] num1, int ptr1, int[] num2, int ptr2) {
        int temp = num1[ptr1];
        num1[ptr1] = num2[ptr2];
        num2[ptr2] = temp;
    }


    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

}
