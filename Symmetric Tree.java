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
    public boolean isSymmetric(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root==null) return true; 
        return checkSym(root.left, root.right);
    }
    boolean checkSym(TreeNode left, TreeNode right)
    {
        if(left==null) return right==null; 
        if(right==null) return false; 
        if(left.val!=right.val) return false; 
        boolean first=checkSym(left.left, right.right);
        boolean second=checkSym(left.right, right.left);
        return first&&second; 
    }
}
