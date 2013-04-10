import java.util.*; 
public class Solution {
    public ArrayList<String> anagrams(String[] strs) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<String> result=new ArrayList<String>();
        if(strs.length==0) return result; 
        HashMap<String, ArrayList<String>> hash=new HashMap<String, ArrayList<String>>();
        for(int i=0; i<strs.length; i++)
        {
            String temp=strs[i];
            char [] a=temp.toCharArray();
            Arrays.sort(a);
            String b=String.copyValueOf(a); 
            if(!hash.containsKey(b))
            {
                 ArrayList<String> sub=new ArrayList<String>();
                 sub.add(temp);
                hash.put(b, sub);
            }else
            {
                ArrayList<String> sub=hash.get(b);
                sub.add(temp);
                hash.put(b, sub);
            }
        }
        Set<String> keyset=hash.keySet();
        for(Iterator<String> itr=keyset.iterator(); itr.hasNext();  )
        {
            ArrayList<String> t=hash.get(itr.next());
            if(t.size()>1) 
            {
                result.addAll(t);
            }
        }
        return result; 
    }
}
