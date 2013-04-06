public class Solution {
    public int atoi(String str) {
        // Start typing your Java solution below
        // DO NOT write main() function
        boolean negative=false; 
        int result=0; 
        int start=0; 
        while(start<str.length() && str.charAt(start)==' ')
        {
            start++; 
        }
        for(int i=start; i<str.length(); i++)
        {
            if(i==start)
            {
                if(str.charAt(i)=='-')
                {
                    negative=true; continue;
                }
                if(str.charAt(i)=='+') continue; 
            }
            if(str.charAt(i)<='9' && str.charAt(i)>='0')
            {
                if((Integer.MAX_VALUE-str.charAt(i)+'0')/10<result)
                return negative? Integer.MIN_VALUE: Integer.MAX_VALUE; 
                result=result*10+str.charAt(i)-'0';
            }else break; 
        }
        return negative? -result: result; 
    }
}
