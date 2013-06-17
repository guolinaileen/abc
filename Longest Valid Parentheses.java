public class Solution {
    public int longestValidParentheses(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Stack<Integer> stack=new Stack<Integer>();
        int left=-1; 
        int max=0; 
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='(')
            {
                stack.push(i);
            }else
            {
                if(!stack.isEmpty())
                {
                    stack.pop(); 
                    if(stack.isEmpty() ) max=Math.max(max, i-left );
                    else max=Math.max(max, i-stack.peek());
                }else
                {
                    left=i;
                }
            }
        }
        return max; 
    }
}
