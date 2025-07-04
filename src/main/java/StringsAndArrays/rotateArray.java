package main.java.StringsAndArrays;

public class rotateArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % nums.length;

        reverse(0, n - 1, nums);
        reverse(0, k - 1, nums);
        reverse(k, n - 1, nums);

        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j] + " ");

        }

    }

    public static void reverse(int start, int end, int[] arr) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8 };
        rotate(nums, 3);

    }
}
