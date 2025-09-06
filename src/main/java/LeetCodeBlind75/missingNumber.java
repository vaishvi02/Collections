package main.java.LeetCodeBlind75;

public class missingNumber {

    public static void main(String[] args){
        int[] nums = {1,0,3};
        missingNumber mn = new missingNumber();
        System.out.println("missing: "+mn.getMissingNumber(nums));
    }

    public int getMissingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n * (n+1))/2;
        int actualSum = 0;

        for(int i=0 ; i< n; i++){
            actualSum += nums[i];
        }

        int result = sum - actualSum;

        return result;
    }
}
