package main.java.StringsAndArrays;

//Needs refinement to replace all non-zero elements as per the current place
public class moveZero {
    public static void moveAllZeros(int[] nums) {
        int j = nums.length;
        int k = nums.length - 1;
        int i = 0;
        while (i < j) {
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k--;
            }
            
            j--;
            i++;
        }
        for (int n = 0; n < nums.length; n++) {
            System.out.print(nums[n] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0,1,0,3,12 };
        moveAllZeros(arr);
    }
}
