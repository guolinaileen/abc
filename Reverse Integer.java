public class Solution {
    public int reverse(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        boolean negative=x<0? true: false; 
        if(negative)x=-x;
        int num=0; 
        while(x!=0)
        {
            if((Integer.MAX_VALUE-x%10)/10<num) return negative? Integer.MIN_VALUE: Integer.MAX_VALUE; 
            num=10*num+x%10; 
            x=x/10; 
        }
        return negative? -num: num; 
    }
}
