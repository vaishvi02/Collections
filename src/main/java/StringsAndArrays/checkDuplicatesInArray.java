package main.java.StringsAndArrays;

public class checkDuplicatesInArray {

    public static int removeDuplicates(int[] nums) {
        int k =1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }


    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 4, 4 }; // 1,
        System.out.println("result = "+removeDuplicates(arr));
    }
}
