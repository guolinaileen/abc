public class Solution {
    public int minCut(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
         int length = s.length();
         int []dp=new int[length+1];
         boolean [][]palin=new boolean[length][length];
         for(int i = 0; i <= length; i++)
                dp[i] = length-i;

      for(int i = length-1; i >= 0; i--)
      {
        for(int j = i; j < length; j++)
        {
          if(s.charAt(i) == s.charAt(j) && (j-i<2 || palin[i+1][j-1]))
          {
            palin[i][j] = true;
            dp[i] = Math.min(dp[i],dp[j+1]+1);
          }
        }
      }
      return dp[0]-1;
    }
}
