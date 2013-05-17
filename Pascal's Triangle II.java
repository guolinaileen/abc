//O(k) space
public class Solution {
    public ArrayList<Integer> getRow(int rowIndex) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> result=new ArrayList<Integer>(); 
        result.add(1);
        if(rowIndex==0) return result; 
        result.add(1);
        if(rowIndex==1) return result; 
        for(int i=2; i<=rowIndex; i++)
        {
            int temp=1; 
            for(int j=1; j<i; j++)
            {
                int first=temp; 
                temp=result.get(j); 
                result.remove(j);
                result.add(j, first+temp);
            }
            result.add(1);
        }
        return result; 
    }
}
