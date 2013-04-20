public class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> array=new ArrayList<ArrayList<Integer>>(); 
        ArrayList<Integer> list=new ArrayList<Integer>();
        array.add(list);
        if(S.length==0) return array; 
        Arrays.sort(S);
        for(int i=0; i<S.length; i++)
        {
            ArrayList<ArrayList<Integer>> subArray=new ArrayList<ArrayList<Integer>>();
            for(ArrayList<Integer> l: array)
            {
                ArrayList<Integer> tl=new ArrayList<Integer>(l);
                tl.add(S[i]);
                subArray.add(tl);
            }
            array.addAll(subArray);
        }
        return array; 
    }
}
