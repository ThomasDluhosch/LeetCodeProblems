package _DailyQuestions;

import java.util.Arrays;

class MaximumProductDifferenceBetweenTwoIntegers{


    public static int maxProductDifference(int[] nums) {


        sort(nums);
        System.out.println(Arrays.toString(nums));

        int w = nums[0];
        int x = nums[1];
        int y = nums[nums.length-2];
        int z = nums[nums.length-1];

        return ((y*z) - (w*x));
    }


    public static void sort(int[] array) {
        int[] copy = Arrays.copyOf(array, array.length);
        sort(array, copy, 0, array.length - 1);
    }

    private static void sort(int[] array, int[] copy, int lo, int hi) {

        // Verbesserung mit CUTOFF für kleine Subarrays (10-15 items)
        // Für kleine SubArrays ist InsertionSort performanter

        int mid = lo + (hi - lo) / 2;

        sort(array, copy, lo, mid);
        sort(array, copy, mid + 1, hi);
        merge(array, copy, lo, mid, hi);
    }

    private static void merge(int[] array, int[] copy, int lo, int mid, int hi) {

        System.arraycopy(array, lo, copy, lo, hi - lo + 1);
        int i = lo;
        int j = mid + 1;

        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                array[k] = copy[j];
                j++;
            } else if (j > hi) {
                array[k] = copy[i];
                i++;
            } else if (copy[j] < copy[i]) {
                array[k] = copy[j];
                j++;
            } else {
                array[k] = copy[i];
                i++;
            }
        }
    }




    public static void main(String[] args) {
        int res = maxProductDifference(new int[] {5,6,2,7,4});
        System.out.println(res);
    }





}