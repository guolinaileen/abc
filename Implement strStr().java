public class Solution {
    public String strStr(String haystack, String needle) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(haystack.length()<needle.length()) return null;
        if(needle.length()==0) return haystack; 
        for(int i=0; i<=haystack.length()-needle.length(); i++)
        {
            String temp=haystack.substring(i, i+needle.length());
            if(temp.equals(needle)) return haystack.substring(i);
        }
        return null; 
    }
}
