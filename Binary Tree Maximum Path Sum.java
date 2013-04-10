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
    int max; 
    public int maxPathSum(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        max=Integer.MIN_VALUE; 
        maxSum(root);
        return max; 
    }
    int maxSum(TreeNode root)
    {
        if(root==null) return 0; 
        int L=maxPathSum(root.left);
        int R=maxPathSum(root.right);
        int subMax=Math.max(Math.max(root.val ,L+R+root.val),root.val+ Math.max(L, R));
        if(subMax>max) max=subMax; 
        return Math.max(root.val, root.val+Math.max(L, R));
    }
}
