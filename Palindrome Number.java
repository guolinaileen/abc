public class Solution {
    public boolean isPalindrome(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(x<0) return false; 
        int counter=1; 
        while(x/counter>=10)
        {
            counter*=10; 
        }
        while(x!=0)
        {
            if(x/counter!=x%10) return false; 
            x=(x%counter)/10; 
            counter/=100; 
        }
        return true; 
    }
}
