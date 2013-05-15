public class Solution {
    public int atoi(String str) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int length=str.length();
        if(length==0) return 0; 
        int index=0; 
        while(index<length && str.charAt(index)==' ')
        {
            index++; 
        }
        boolean negative=false; 
        if(str.charAt(index)=='-'||str.charAt(index)=='+' )
        {
            negative=str.charAt(index)=='-'? true: false;
            index++; 
        }
        int num=0; 
        for(int i=index; i<length; i++)
        {
            if(!(str.charAt(i)<='9'&&str.charAt(i)>='0')) break; 
            if((Integer.MAX_VALUE-(str.charAt(i)-'0'))/10<num) return negative? Integer.MIN_VALUE: Integer.MAX_VALUE;
            num=num*10+(str.charAt(i)-'0');
        }
        return negative? -num: num; 
    }
}
