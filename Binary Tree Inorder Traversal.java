/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> list=new ArrayList<Integer>(); 
        if(root==null) return list; 
        Stack<TreeNode> stack=new Stack<TreeNode>();
        stack.push(root); 
        while(!stack.isEmpty())
        {
            TreeNode top=stack.peek();
            if(top.left!=null)
            {
                stack.push(top.left);
            }else
            {
                while(!stack.isEmpty())
                {
                    list.add(top.val);
                    stack.pop();
                    if(top.right!=null)
                    {
                        stack.push(top.right); break; 
                    }else
                    {
                        if(!stack.isEmpty())
                        {
                            top=stack.peek(); 
                        }else break; 
                    }
                }
            }
        }
        return list; 
    }
}
