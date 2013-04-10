public class Solution {
    public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(prices.length==0) return 0; 
        int profit=0; 
        int pre=prices[0];
        for(int i=1; i<prices.length; i++)
        {
            if(prices[i]>=pre)
            {
                profit+=prices[i]-pre;
                pre=prices[i];
            }else
            {
                pre=prices[i];
            }
        }
        
        return profit; 
    }
}
