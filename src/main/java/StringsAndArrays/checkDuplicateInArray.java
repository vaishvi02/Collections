package main.java.StringsAndArrays;

import java.util.HashSet;
import java.util.Set;

public class checkDuplicateInArray {
    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> hs = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!hs.contains(nums[i])) {
                hs.add(nums[i]);
            } else
                return true;

        }
        System.out.println("hs= " + hs);
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        System.out.println("is duplicate: " + containsDuplicate(nums));
    }

}
