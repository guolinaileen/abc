public class Solution {
    public int lengthOfLastWord(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(s.length()==0) return 0; 
        String [] arrays=s.split(" ");
        int length=arrays.length; 
        if(length==0) return 0; 
        return arrays[length-1].length(); 
    }
}
