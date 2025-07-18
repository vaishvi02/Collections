package main.java.StringsAndArrays;

public class moveZero {
    public static void moveAllZeros(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
            
        }
        for (int n = 0; n < nums.length; n++) {
            System.out.print(nums[n] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10,0,0,5,7,0,1,0,3,12 };
        moveAllZeros(arr);
    }
}
