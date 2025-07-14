package main.java.StringsAndArrays;

public class twoSum {

    //  public static int[] twoSum(int[] nums, int target) {
    //     int[] result = new int[2];

    //     for(int i=0; i<nums.length; i++){
    //         for(int j=i+1; j<nums.length; j++){
    //             if(nums[i] + nums[j] == target){
    //                 result[0] = i;
    //                 result[1] = j;
    //             }
    //         }
    //     }
    //     for(int k=0; k<result.length; k++){
    //         System.out.println(result[k]);
    //     }

    //     return result;
    // }


    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int i = 0;
        int j = nums.length;
        while(i < j){
            if(nums[i] + nums[j] == target){
                result[0] = i;
                result[1] = j;
                break;
            }
            i++;
            j--;
        }
        for(int k=0; k<result.length; k++){
            System.out.println(result[k]);
        }

        return result;
    }

    public static void main(String[] args) {
     int[] nums = {3,3};
        twoSum(nums,6);
    }
    
}
