public class Solution {
    public String getPermutation(int n, int k) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> list=new ArrayList<Integer>(); 
        int d=1; 
        for(int i=1; i<=n; i++)
        {
            list.add(i);
            d*=i;
        }
        StringBuffer sb=new StringBuffer(); 
        for(int i=n; i>0; i--)
        {
            d=d/i;
            int q=(k-1)/d;
            sb.append(list.get(q));
            list.remove(q);
            k=k-q*d;
        }
        return sb.toString(); 
    }
}
