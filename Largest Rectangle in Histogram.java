public class Solution {
    public int largestRectangleArea(int[] height) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(height.length==0) return 0; 
        int i=0; 
        int max=0; 
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(0);
        while(i<height.length || !stack.isEmpty())
        {
            if(i<height.length &&( stack.isEmpty() || height[i]>=height[stack.peek()]))
            {
                stack.push(i); i++;
            }else
            {
                int top=stack.pop();
                max=Math.max(max, height[top]*(stack.isEmpty()? i: i-stack.peek()-1));
            }
        }
        return max; 
    }
}
