package main.java.StringsAndArrays;

public class buySellStocks {
    public static int maxProfit(int[] prices) {
        int minSoFar = prices[0];
        int profit =0;
        for(int i=0 ; i<prices.length-1;i++){
            minSoFar = Math.min(prices[i],minSoFar);
            profit = Math.max(profit,(prices[i] - minSoFar));
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println("Total profit: "+maxProfit(prices));
    }
}
