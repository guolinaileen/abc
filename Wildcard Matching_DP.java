public class Solution {
    int count; 
    public boolean isMatch(String s, String p) {
        // Start typing your Java solution below
        // DO NOT write main() function
        count=0; 
        p=preProcess(p);
        if(count>s.length()) return false; 
        if(s.length()==0)   return p.length()==0 || p.equals("*") ; 
        if(s.length()!=0 && p.length()==0)   return false; 
        return check(s, p);
    }
    boolean check(String s, String p)
    {
        // the row is for each char in p
        // the col is for each char in s
        boolean [][]array=new boolean [2][s.length()+1];
        //start from the second line, the first line is empty
        int flag=1; 
        array[0][0]=true; 
        int index=0; //index of p
        while(index<p.length())
        {
            int start=1; 
            if(p.charAt(index)=='*')
            {
                array[flag][0]=array[flag==0? 1: 0][0];
                while(start<=s.length())
                {
                    if(array[flag==0? 1: 0][start] || array[flag][start-1]) break; 
                    else array[flag][start]=false; 
                    start++; 
                }
                while(start<=s.length())
                {
                    array[flag][start]=true; 
                    start++; 
                }
            }else
            {
                int indexS=0; 
                while(indexS<s.length())
                {
                    boolean r_flag=false;
                    if(s.charAt(indexS)==p.charAt(index) || p.charAt(index)=='?')
                    {
                        r_flag=array[flag==0? 1: 0][start-1];
                    }
                    array[flag][start]=r_flag;
                    start++; 
                    indexS++; 
                }
                array[flag][0]=false;
            }            
            index++; 
            flag=(flag==1? 0: 1); 
        }
        return array[flag==1? 0: 1][s.length()];
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
