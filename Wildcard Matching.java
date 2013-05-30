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


//another solution: 
public class Solution {
    int count; 
    public boolean isMatch(String s, String p) {
        // Start typing your Java solution below
        // DO NOT write main() function
        count=0; 
        p=preProcess(p);
        if(count>s.length()) return false; 
        return check(s, p);
    }
    boolean check(String s, String p)
    {
         if(s.length()==0)   return p.length()==0 || p.equals("*") ; 
         if(s.length()!=0 && p.length()==0)   return false; 
         if(s.charAt(0)==p.charAt(0)||p.charAt(0)=='?') return check(s.substring(1), p.substring(1));
         if(p.charAt(0)!='*') return false; 
         return check(s, p.substring(1)) || check(s.substring(1), p);
    }
    String preProcess(String p)
    {
        StringBuffer sb=new StringBuffer(); 
        boolean flag=false; 
        for(int i=0; i<p.length(); i++)
        {
            if(p.charAt(i)!='*')
            {
                count++; flag=false; sb.append(p.charAt(i));
            }else
            {
                if(!flag)
                {
                    flag=true; sb.append(p.charAt(i));
                }
            }
        }
        return sb.toString();
    }
}
