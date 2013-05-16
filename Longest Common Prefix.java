public class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(strs.length==0) return ""; 
        String result=strs[0];
        for(int i=1; i<strs.length; i++)
        {
            if(strs[i].length()<result.length()) result=result.substring(0, strs[i].length());
            for(int j=0; j<result.length(); j++)
            {
                if(result.charAt(j)!=strs[i].charAt(j))
                {
                    result=result.substring(0, j); break; 
                }
            }
        }
        return result; 
    }
}
