public class Solution {
    public int reverse(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        boolean negative=false; 
        if(x<0) 
        {
            negative=true; 
            x=-x; 
        }
        int result=0; 
        while(x!=0)
        {
            if(Integer.MAX_VALUE/10<result) 
             return negative? Integer.MIN_VALUE: Integer.MAX_VALUE; 
            result=result*10+ x%10;
            x/=10; 
        }
        return negative? -result: result; 
    }
}
