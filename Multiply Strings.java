public class Solution {
    public String multiply(String num1, String num2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(num1.compareTo("0")==0 || num2.compareTo("0")==0 )
        {
            return "0"; 
        }
        int L1=num1.length(), L2=num2.length(), L=L1+L2;
        int []arrays=new int [L]; 
        for(int i=0; i<L1; i++)
        {
            for(int j=0; j<L2; j++)
            {
             arrays[i+j+1]+=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');   
            }
        }
        char [] results=new char [L];
        for(int i=0; i<L; i++)
         {
	        	results[i]='0';
	       }      
        for(int i=L-1; i>0; i--)
        {
            if(arrays[i]>9)
            {
                arrays[i-1]+=arrays[i]/10; 
            }
            results[i]+=arrays[i]%10;
        }
        if(arrays[0]!=0) results[0]+=arrays[0]; 
        String result= new String(results); 
        if(arrays[0]==0) return result.substring(1); 
        return result; 
    }
}
