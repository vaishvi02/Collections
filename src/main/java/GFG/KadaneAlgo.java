package main.java.GFG;

public class KadaneAlgo {

    public int findMaxSubArraySum(int[] arr) {
        int maxEndingHere = arr[0];
        int maxSoFar = arr[0];

        for (int i = 0; i < arr.length; i++) {
            maxEndingHere = Math.max(maxEndingHere + arr[i], arr[i]);
            maxSoFar = Math.max(maxEndingHere, maxSoFar);

        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        KadaneAlgo obj = new KadaneAlgo();
        int[] arr = { -1, 25, 25, 18, 18, 2, -8, 6, -17, 20, 8 };
        System.out.println(obj.findMaxSubArraySum(arr));
    }
}
