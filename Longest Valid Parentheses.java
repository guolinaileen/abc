public class Solution {
    class Pair
    {
        char c; 
        int index; 
        Pair(char val, int i)
        {
            c=val; 
            index=i; 
        }
    }
    public int longestValidParentheses(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(s.length()<2) return 0;
        Stack<Pair> stack=new Stack<Pair>(); 
        int max=0; 
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='(')
            {
                stack.push(new Pair('(', i));
            }else
            {
                
                if(stack.isEmpty() || stack.peek().c==')') 
                {
                    stack.push(new Pair(')', i));
                }else
                {
                    stack.pop(); 
                    if(stack.isEmpty())
                    {
                        max=Math.max(max, i+1);
                    }else
                    {
                        Pair peek=stack.peek();
                        max=Math.max(max, i-peek.index);
                    }
                }
            }
        }
        return max; 
    }
}
