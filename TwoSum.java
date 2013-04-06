public class Solution {
    class Pair
    {
        int index; int val; 
        Pair(int i, int v)
        {
            index=i; val=v; 
        }
    }
    public static final Comparator <Pair> Pair_Order=new Comparator<Pair>()
    {
        public int compare(Pair a, Pair b)
        {
            return new Integer(a.val).compareTo(new Integer(b.val));
        }
    }; 
    public int[] twoSum(int[] numbers, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int [] result=new int [2];
        if(numbers.length==0) return result;
        Pair [] pairs=new Pair [numbers.length];
        for(int i=0; i<numbers.length; i++)
        {
            pairs[i]=new Pair(i, numbers[i]);
        }
        Arrays.sort(pairs, Pair_Order);
        int start=0, end=numbers.length-1;
        while(start<end)
        {
            int sum=pairs[start].val+pairs[end].val;
            if(sum==target)
            {
                result[0]=pairs[start].index+1; 
                result[1]=pairs[end].index+1;
                Arrays.sort(result);
                return result; 
            }else if(sum<target)
            {
                start++; 
            }else
            {
                end--; 
            }
        }
        return result; 
    }
}
