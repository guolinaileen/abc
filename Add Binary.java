public class Solution {
    public String addBinary(String a, String b) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(a.length()==0) return b; 
        if(b.length()==0) return a; 
        String result="";
        int carry=0; 
        for(int i=0; i<Math.max(a.length(), b.length()); i++)
        {
            int x=i>a.length()-1? 0: a.charAt(a.length()-1-i)-'0'; 
            int y=i>b.length()-1? 0: b.charAt(b.length()-1-i)-'0';
            int temp=(x+y+carry)%2; 
            result=temp+result; 
            carry=(x+y+carry)/2;
        }
        if(carry!=0) result="1"+result; 
        return result; 
    }
}
