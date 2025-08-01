package main.java.StringsAndArrays;

public class missingNum {

    public int findMissingNum(int[] arr) {
        long n = arr.length + 1;
        long actual_sum = (n * (n + 1)) / 2;
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        int missing_num = (int) (actual_sum - sum);
        return missing_num;
    }
}
