public class Solution {
    public int divide(int dividend, int divisor) {
        // Start typing your Java solution below
        // DO NOT write main() function
        /*using long type is because Math.abs(Integer.MIN_VALUE) is still Integer.MIN_VALUE;
        Integer.MIN_VALUE: -2147483648
        Integer.MAX_VALUE:  2147483647
        */
        long a=Math.abs((long )dividend);
        long b=Math.abs((long )divisor);
        boolean negative=false; 
        if(dividend<0) negative=!negative; 
        if(divisor<0) negative=!negative; 
        int result=0;
        while(a>=b)
        {
            long c=b; 
            for(int i=0; a>=c ; i++, c<<=1 )
            {
                a-=c; 
                result+=1<<i;
            }
        }
        return negative? -result: result; 
    }
}
