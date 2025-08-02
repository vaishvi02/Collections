package main.java.LeetCodeBlind75;

public class ClimbStairs {
    public static int climbStairs(int n) {
        int a = 0;
        int b = 1;
        int result = 0;
        n = n + 2;
        // int sum = a + b;
        // System.out.println(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int c = a + b;
            a = b;
            b = c;
            // System.out.print(c + " ");
            result = c;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(2));
    }
}
