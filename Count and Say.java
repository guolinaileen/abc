public class Solution {
    public String countAndSay(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        String result=""; 
        if(n==0) return result; 
        result="1"; 
        if(n==1) return result;
        int count=1; 
        for(int i=1; i<n; i++)
        {
            StringBuffer sb=new StringBuffer(); 
            for(int j=0; j<result.length(); j++)
            {
                while(j<result.length()-1 && result.charAt(j)==result.charAt(j+1))
                {
                    count++; 
                    j++; 
                }
                sb.append(Integer.toString(count)+result.charAt(j));
                count=1; 
            }
            result=sb.toString(); 
        }
        return result; 
    }
}
