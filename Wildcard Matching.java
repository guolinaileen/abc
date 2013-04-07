public class Solution {
    public boolean isMatch(String s, String p) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(p.length()==0) return s.length()==0; 
        if(s.length()==0)
        {
            if(p.charAt(0)!='*') return false; 
            return isMatch("", p.substring(1));
        }
        if(s.charAt(0)==p.charAt(0) || p.charAt(0)=='?')
        return isMatch(s.substring(1), p.substring(1));
        if(p.charAt(0)=='*')
        {
            while(p.length()>1 && p.charAt(1)=='*' )
            {
                p=p.substring(1);
            }
            if(isMatch(s.substring(1), p)) return true; 
            return isMatch(s, p.substring(1));
        }
        return false; 
    }
}
