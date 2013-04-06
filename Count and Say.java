public class Solution {
    public String countAndSay(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        String result="";
        if(n==0) return result; 
        result="1"; 
        while(n!=1)
        {
            StringBuffer sb=new StringBuffer(); 
            int counter=1; int index=0; 
            while((index+counter)<=result.length())
            {
                if(index+counter==result.length() || result.charAt(index)!=result.charAt(index+counter)) 
                {
                  sb.append(counter);
                  sb.append(result.charAt(index));                   
                  index=index+counter;
                  counter=1; 
                }else 
                {
                    counter++; 
                }
            }
            n--; 
            result=sb.toString(); 
            }
            return result; 
        }
}
