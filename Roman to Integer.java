public class Solution {
    public int romanToInt(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        HashMap<Character, Integer> map=new HashMap<Character, Integer>(); 
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);
        int result=0; 
        for(int i=0; i<s.length()-1; i++)
        {
            if(map.get(s.charAt(i))<map.get(s.charAt(i+1)))
            {
                result-=map.get(s.charAt(i));
            }else
            {
                result+=map.get(s.charAt(i));
            }
        }
        result+=map.get(s.charAt(s.length()-1));
        return result; 
    }
}
