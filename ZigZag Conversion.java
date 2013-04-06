public class Solution {
    public String convert(String s, int nRows) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(nRows==1) return s; 
        int nodes=2*(nRows-1); //nRows+nRows-2 
        int zones=s.length()%nodes==0? s.length()/nodes: (s.length()/nodes+1) ;
        StringBuffer sb=new StringBuffer(); 
        for(int i=0; i<nRows; i++)
        {
            for(int j=0; j<zones; j++)
            {
                if(i+nodes*j<s.length())
                {
                    sb.append(s.charAt(i+nodes*j));
                }    
                if(i!=0 && i!=nRows-1)
                {
                 if(nodes*(j+1)-i<s.length())
                 {
                 sb.append(s.charAt(nodes*(j+1)-i));
                 }    
                }
            }
        }
        return sb.toString(); 
    }
}
