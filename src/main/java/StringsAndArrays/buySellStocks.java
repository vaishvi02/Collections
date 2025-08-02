package main.java.StringsAndArrays;

public class buySellStocks {
    public static int maxProfit(int[] prices) {
        int sum = 0;
        for(int i=0; i< prices.length-1; i++){
            if(prices[i] < prices[i+1]){
                sum = sum + (prices[i+1] - prices[i]);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println("Total profit: "+maxProfit(prices));
    }
}
