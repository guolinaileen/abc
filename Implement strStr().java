public class Solution {
    public String strStr(String haystack, String needle) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(needle.length()==0) return haystack; 
        if(haystack.length()==0) return null; 
        for(int i=0; i<=haystack.length()-needle.length(); i++)
        {
            if(haystack.charAt(i)==needle.charAt(0))
            {
                for(int j=0; j<=needle.length(); j++ )
                {
                    if(j==needle.length()) return haystack.substring(i);
                    if(haystack.charAt(i+j)!=needle.charAt(j))
                    {
                        break; 
                    }
                }   
            }
        }
        return null; 
    }
}
