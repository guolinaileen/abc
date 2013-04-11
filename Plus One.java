public class Solution {
    public int[] plusOne(int[] digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int [] result=new int[1];
        result[0]=1; 
        if(digits.length==0) return  result; 
        int carry=0; 
        for(int i=digits.length-1; i>=0; i--)
        {
            digits[i]=digits[i]+1;
            carry=digits[i]/10;
            digits[i]=digits[i]%10;
            if(carry==0) return digits; 
        }
        result=new int[digits.length+1];
        result[0]=1; 
        return result; 
    }
}
