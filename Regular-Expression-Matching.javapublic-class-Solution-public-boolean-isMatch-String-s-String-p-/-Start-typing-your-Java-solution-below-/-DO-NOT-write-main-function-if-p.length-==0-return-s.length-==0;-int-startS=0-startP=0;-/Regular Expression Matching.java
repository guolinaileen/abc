public class Solution {
    public boolean isMatch(String s, String p) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(p.length()==0) return s.length()==0; 
      int startS=0, startP=0; 
	       //s is only one character or the second p is not *
	    if(((startP+1==p.length()))||(startP+1<p.length() && p.charAt(startP+1)!='*'))
	        {
	            if(s.length()!=0 && (s.charAt(startS)==p.charAt(startP)|| p.charAt(startP)=='.') ) 
                return isMatch(s.substring(startS+1), p.substring(startP+1)); 
	            return false;
	        }
            while((startS!=s.length()) &&( p.charAt(startP)=='.'||s.charAt(startS)==p.charAt(startP)))
            {
                if(isMatch(s.substring(startS), p.substring(startP+2)) ) return true; 
                startS++; 
            }
	        return isMatch(s.substring(startS), p.substring(startP+2)); 
    }
}
