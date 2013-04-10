public class Solution {
    public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(prices.length==0) return 0; 
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int profit=0; 
        for(int i=0; i<prices.length; i++)
        {
            if(prices[i]<=min)
            {
                min=prices[i];
                max=prices[i];
            }else
            {
                if(prices[i]>max)
                {
                    max=prices[i]; 
                    profit=Math.max(profit, max-min);
                }
            }
        }
        return profit; 
    }
}
