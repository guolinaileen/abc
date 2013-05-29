public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int [] result=new int [2];
        if(numbers.length==0) return result; 
        HashMap<Integer, Integer> map=new HashMap<Integer, Integer>(); 
        for(int i=0; i<numbers.length; i++)
        {
            if(!map.containsKey(target-numbers[i]))
            {
                map.put(numbers[i], i);
            }else
            {
                result[0]=map.get(target-numbers[i])+1;
                result[1]=i+1;
                return result; 
            }
        }
        return result; 
    }
}
