package Arrays_and_Hashing;

import java.util.*;

/*
    LeetCode Problem 347
    Given an integer array 'nums' and an integer 'k', return the 'k' most
    frequent elements. You may return the answer in any order.
 */

public class TopKFrequentElements {

    public static int[] topKFrequent(int[] nums, int k) {

        int length = nums.length;
        int numberOfValuesK = 0;
        int[] result = new int[k];
        // map = number, frequency
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();



        for (int i = 0; i < length; i++) {

            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
                continue;
            }
            map.put(nums[i], 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                (a, b) -> Integer.compare(b.getValue(), a.getValue())
        );

        pq.addAll(map.entrySet());

        // Add the top k frequent elements to the result array
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll().getKey();
        }

        return result;
    }
}