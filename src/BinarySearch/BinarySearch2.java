package BinarySearch;

public class BinarySearch2 {

    public static int search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length-1;
        int mid;

        while(lo < hi){
            mid = lo + (hi-lo)/2;
            if(target > nums[mid])
                lo = mid+1;
            else if(target < nums[mid])
                hi = mid-1;
            else
                return mid;
        }
        return -1;
    }
}


