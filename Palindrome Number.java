public class Solution {
    public boolean isPalindrome(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(x<0) return false; 
        int length=1; 
        int tempX=x; 
        while(tempX/10!=0)
        {
            length*=10; 
            tempX=tempX/10; 
        }
        /*
        old strategy will cause overflow: 
        int d=1; 
        while(x/d!=0)
        {
        d*=10; 
        }
        d/=10; 
        */

        while(x!=0)
        {
            int left=x/length;
            int right=x%10;
            if(left!=right) return false; 
            x=(x-left*length)/10; 
            length/=100; 
        }
        return true; 
    }
}

        /*
        it can be done in this way: 
        */
public class Solution {
    public boolean isPalindrome(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(x<0) return false; 
        int d=1;
        while(x/d>=10)
        {
            d*=10;
        }
        while(d!=0)
        {
            if(x/d!=x%10) return false; 
            x=(x-x/d*d)/10; 
            d/=100;
        }
        return true; 
    }
}
