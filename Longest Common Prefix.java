public class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(strs.length==0) return ""; 
        String result=strs[0];
        for(int i=1; i<strs.length; i++)
        {
            int length=Math.min(result.length(), strs[i].length()); 
            for(int j=0 ; j<=length; j++)
            {
                if(j==length) result=result.substring(0, j);
                else
                if(result.charAt(j)!=strs[i].charAt(j))
                {
                    if(j==0) return ""; 
                    result=result.substring(0, j); break; 
                }
            }
        }
        return result; 
    }
}
