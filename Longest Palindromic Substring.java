public class Solution {
    public String longestPalindrome(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(s.length()==0) return s; 
        String original=s; 
        s=preProcess(s);
        int c=0, l=0, r=0; 
        /*how many matching characters at the center c */
        int [] p=new int[s.length()];
        for(int i=0; i<s.length(); i++)
        {
            int i_prime=c-(i-c); /*i_prime is located at left and i is located at right */
            if(r>i && i_prime>=0)
            {
                if(p[i_prime]<=r-i) p[i]=p[i_prime]; //careful about here: check p[i_prime] before assigning the value
            }
            while(i-p[i]-1>=0 && i+p[i]+1<s.length() &&  s.charAt(i-p[i]-1)==s.charAt(i+p[i]+1))
            {
                p[i]++; 
            }
            if(p[i]+i>r)
            {
                c=i;
                r=p[i]+i;
            }
        }
        int maxL=0, center=0; 
        for(int i=0; i<s.length(); i++)
        {
            if(p[i]>maxL)
            {
                center=i; 
                maxL=p[i]; 
            }
        }
        return original.substring((center-maxL)/2, (center+maxL)/2); // good method
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
