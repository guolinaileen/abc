public class Solution {
    public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>(); 
        if(num.length==0) return result; 
        Arrays.sort(num);
        boolean [] visited=new boolean[num.length];
        ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>(); 
        ArrayList<Integer> sublist=new ArrayList<Integer>(); 
        permute(num, visited, sublist, list); 
        return list; 
    }
    void permute(int [] num, boolean [] visited, ArrayList<Integer> sublist, ArrayList<ArrayList<Integer>> list)
    {
        if(sublist.size()==num.length)
        {
            list.add(new ArrayList<Integer>(sublist)); return ;
        }
        for(int i=0; i<num.length; i++)
        {
            if(i!=0 && num[i]==num[i-1] && visited[i-1]) continue; 
            //check the previous same element, if it has been visited, we move forward, if not, we still can use this element
            if(!visited[i])
            {
                sublist.add(num[i]);
                visited[i]=true; 
                permute(num, visited, sublist, list);
                visited[i]=false; 
                sublist.remove(sublist.size()-1);
            }
        }
        
    }
}
