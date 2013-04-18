public class Solution {
    public int climbStairs(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int [] path=new int[n+1];
        return climb(n, path);
    }
    int climb(int index, int [] path)
    {
     if(index==1||index==0)
     {
         path[index]=1; 
         return path[index];
     }
     if(path[index]!=0) return path[index];
     path[index]=climb(index-1, path)+climb(index-2, path);
     return path[index];
    }
}
