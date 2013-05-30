public class Solution {
    public int longestValidParentheses(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
       if(s.length()==0) return 0; 
       Stack<Integer> stack=new Stack<Integer>(); 
       //create left to indicate the leftmost value
       int left=0; 
       int max=0; 
       for(int i=0; i<s.length(); i++)
       {
           if(s.charAt(i)=='(')
           {
               stack.push(i);
           }else
           {
               if(stack.isEmpty())
               {
                   left=i+1; 
               }else
               {
                   stack.pop(); 
                   if(stack.isEmpty())
                   {
                       max=Math.max(max, i-left+1);
                   }else
                   {
                       max=Math.max(max, i-stack.peek());
                   }
               }
           }
       }
       return max; 
    }
}
