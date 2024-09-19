package Leetcode_Topicwise_Ques.Array;

public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {

        // -----TLE error----
        // int maxProfit = 0;
        // for(int i = 0; i<prices.length-1; i++){
        //     for(int j = i+1; j<prices.length; j++){
        //         if(prices[i] < prices[j]){
        //             int diff = prices[j] - prices[i]; 
        //             maxProfit = maxProfit < diff? diff: maxProfit;

        //         }
        //     }
        // }

        // return maxProfit;


        // -----approach 2-----
        int maxProfit = 0;
        int stockBuy = prices[0];
        for(int i = 1; i<prices.length; i++){
            
            if(prices[i] < stockBuy){
               stockBuy = prices[i];
            }else if(prices[i] - stockBuy > maxProfit){
                maxProfit = prices[i] - stockBuy;
            }
            
        }

        return maxProfit;
    }
}
