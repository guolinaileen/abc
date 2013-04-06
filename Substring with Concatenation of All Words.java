public class Solution {
    public ArrayList<Integer> findSubstring(String S, String[] L) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> result=new ArrayList<Integer>();
        if(L.length==0) return result;
        HashMap<String, Integer> map=new HashMap<String, Integer>();
        for(int i=0; i<L.length; i++)
        {
            if(map.containsKey(L[i]))
            {
                map.put(L[i], map.get(L[i])+1);
            }else
            {
                map.put(L[i], 1);
            }
        }
        int size=L.length; 
        int length=L[0].length(); 
        for(int i=0; i<=S.length()-length*size; i++)
        {
            HashMap<String, Integer> Tmap=new HashMap<String, Integer>(map);
            for(int j=0; j<size; j++)
            {
                String first=S.substring(i+j*length, i+(j+1)*length);
            if(Tmap.containsKey(first))
            {
                if(Tmap.get(first)==1)
                Tmap.remove(first);
                else
                Tmap.put(first, Tmap.get(first)-1);
            }else break; 
            }
            if(Tmap.isEmpty()) result.add(i);
        }
        return result; 
    }
}
