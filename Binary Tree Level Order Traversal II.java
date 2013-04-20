/*
we can also add the ArrayList<Integer> in the result's front by using index 0 
*/

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
    public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>(); 
        if(root==null) return result; 
        Stack<ArrayList<Integer>> stack=new Stack<ArrayList<Integer>>(); 
        ArrayList<TreeNode> list= new ArrayList<TreeNode>(); 
        ArrayList<Integer> listVal= new ArrayList<Integer>(); 
        list.add(root);
        listVal.add(root.val);
        stack.push(listVal);
        while(!list.isEmpty())
        {
            ArrayList<TreeNode> subList=new ArrayList<TreeNode>();
            ArrayList<Integer> subListVal=new ArrayList<Integer>();
            for(TreeNode p: list)
            {
                if(p.left!=null)
                {
                    subList.add(p.left);
                    subListVal.add(p.left.val);
                }
                if(p.right!=null)
                {
                    subList.add(p.right);
                    subListVal.add(p.right.val);
                }
            }
            if(subList.size()!=0) stack.push(subListVal);
            list=subList;
        }
        while(!stack.isEmpty())
        {
            ArrayList<Integer> top=stack.pop();
            result.add(top);
        }
        return result; 
    }
}
