package main.java.LeetCodeBlind75;

import java.util.HashMap;
import java.util.Map;

public class twoSum {

    public static int[] twoSums(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        int remaining_target;
        for (int i = 0; i < nums.length; i++) {
            System.out.println("hm = " + hm);
            remaining_target = target - nums[i]; // get the remaining element to be found
            if (hm.containsKey(remaining_target)) {// if it exists in hashmap, then we have found our match, return
                                                   // indexes
                return new int[] { i, hm.get(remaining_target) };
            } // return [current_index,index of element in hashmap]
            hm.put(nums[i], i); // put all the elements in hashmap
        }
        throw new IllegalArgumentException("No solution");

    }

    public static void main(String[] args) {
        int[] nums = { 3, 9, 4, 2, 1 };
        int[] arr = twoSums(nums, 6);
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }

}
