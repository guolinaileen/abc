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
    public boolean isBalanced(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(balanced(root)!=-1) return true; 
        return false; 
    }
    int balanced(TreeNode root)
    {
        if(root==null) return 0;
        int left=balanced(root.left);
        int right=balanced(root.right);
        if(left==-1 || right==-1) return -1; 
        if(Math.abs(left-right)>1) return -1; 
        return Math.max(left, right)+1;
    }
}
