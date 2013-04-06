public class Solution {
    public int maxArea(int[] height) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(height.length<2) return 0; 
        int start=0, end=height.length-1; 
        int max=0; 
        while(start<end)
        {
            max=Math.max(max, Math.min(height[end],height[start])*(end-start));
            if(height[end]>height[start])
            {
                start++; 
            }else
            {
                end--; 
            }
        }
        return max; 
    }
}
