public class Solution {
    public ArrayList<String> restoreIpAddresses(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<String> result=new ArrayList<String>(); 
        restore(result, 0, "", 0,  s); 
        return result; 
    }
    void restore(ArrayList<String> result, int part, String cur, int index,  String s)
    {
        if(index==s.length() && part==4)
        {
            result.add(cur.substring(0, cur.length()-1));
            return ;
        }
        if(s.length()-index<(4-part)) return ;
        if(s.length()-index>(4-part)*3) return ;
        int num=0; 
        for(int i=index; i<index+3 && i<s.length(); i++)
        {
            num=10*num+s.charAt(i)-'0';
            if(num<=255)
            {
                restore(result, part+1, cur+Integer.toString(num)+".", i+1,  s); 
            }
            if(num==0) break; 
        }     
    }
}
