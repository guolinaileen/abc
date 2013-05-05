public class Solution {
    public int maximalRectangle(char[][] matrix) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(matrix.length==0) return 0; 
        int [][] calMatrix=new int [matrix.length][matrix[0].length]; 
        for(int j=0; j<matrix[0].length; j++)
        {
            for(int i=0; i<matrix.length; i++)
            {
                if(matrix[i][j]=='0')
                {
                    calMatrix[i][j]=0;
                }else
                {
                    calMatrix[i][j]=1+(i>0? calMatrix[i-1][j]: 0);
                }
            }
        }
        int result=0; 
        for(int i=0; i<matrix.length; i++)
        {
            result=Math.max(result, largestRectangleArea(calMatrix[i]) );
        }
        return result; 
    }
    
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
