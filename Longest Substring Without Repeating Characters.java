public class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        boolean [] mark=new boolean [256]; //assume ASCII 
        int max=0;
        int start=0; 
        for(int i=0; i<s.length(); i++)
        {
            if(!mark[s.charAt(i)])
            {
                mark[s.charAt(i)]=true;
            }else
            {
                max=Math.max(max, i-start);
                while(s.charAt(start)!=s.charAt(i))
                {
                    mark[s.charAt(start)]=false; 
                    start++; 
                }
                start++; 
            }
        }
        max=Math.max(max, s.length()-start);
        return max; 
    }
}
