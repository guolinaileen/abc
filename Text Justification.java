public class Solution {
    public ArrayList<String> fullJustify(String[] words, int L) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int index=0;
        int start=0; 
        int length=0; 
        ArrayList<String> result=new ArrayList<String>(); 
        if(words.length==0) return result; 
        while(index<words.length)
        {
            if((length+words[index].length())<=L)
            {
                length+=(words[index].length()+1);
                index++; 
            }else
            {
                if(index==start+1)
                {
                    int rest=L-words[start].length();
                    String lineResult=words[start];
                    while(rest>0)
                    {
                        lineResult+=" ";  rest--; 
                    }
                    result.add(lineResult);
                    start++;  
                    length=0; 
                }else
                {
                    length=length-(index-start); 
                    int gap=(L-length)/(index-start-1);
                    String empty=""; 
                    while(gap!=0)
                    {
                        empty+=" ";  gap--; 
                    }
                    int reminder=(L-length)%(index-start-1);
                    StringBuffer sb=new StringBuffer(); 
                    while(start<index)
                    {
                        sb.append(words[start]);
                        start++; 
                        if(start<index)sb.append(empty);
                        if(reminder>0)
                        {
                            sb.append(" "); reminder--; 
                        }
                 
                }
                result.add(sb.toString());
                length=0; 
                }
                
            }
        }
        if(start!=words.length)
        {
            StringBuffer sb=new StringBuffer();
            while(start<words.length)
            {
                sb.append(words[start]);
                start++;
                if(start<words.length) sb.append(" ");
            }
            String empty="";
            length--; 
            while(length<L)
            {
                sb.append(" "); length++; 
            }
            result.add(sb.toString());
        }
        return result; 
    }
}
