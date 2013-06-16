public class Solution {
    public String longestPalindrome(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        String sNew=preProcess(s);
        int M=0, R=0; 
        int [] P=new int[sNew.length()];
        for(int i=0; i<sNew.length(); i++)
        {
            int i_p=M-(i-M); 
            if(i_p>=0)
            {
                if(i<R && i+P[i_p]<=R)
                {
                    P[i]=P[i_p];
                }
            }
            while(i-P[i]-1>=0 && i+P[i]+1<sNew.length() && sNew.charAt(i+P[i]+1)==sNew.charAt(i-P[i]-1))
            {
                P[i]++; 
            }
            if(i+P[i]>R)
            {
                R=i+P[i]; 
                M=i;
            }
        }
        int mid=0; 
        int length=0; 
        for(int i=0; i<sNew.length(); i++)
        {
            if(P[i]>length)
            {
                length=P[i]; mid=i; 
            }
        }
        return s.substring((mid-length)/2, (mid+length)/2);
    }
    String preProcess(String s)
    {
        StringBuffer sb=new StringBuffer(); 
        for(int i=0; i<s.length(); i++)
        {
            sb.append("#");
            sb.append(s.charAt(i));
        }
        sb.append("#");
        return sb.toString(); 
    }
}
