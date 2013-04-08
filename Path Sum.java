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
    public boolean hasPathSum(TreeNode root, int sum) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root==null) return false; 
        if(root.left==null && root.right==null) return root.val==sum; 
        boolean left=false; 
        if(root.left!=null) left=hasPathSum(root.left, sum-root.val);
        boolean right=false; 
        if(root.right!=null) right=hasPathSum(root.right, sum-root.val);
        return left||right; 
    }
}
