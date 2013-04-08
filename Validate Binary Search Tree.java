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
    public boolean isValidBST(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        return isValid(root, Integer.MAX_VALUE, Integer.MIN_VALUE); 
    }
    
    boolean isValid(TreeNode root, int max, int min)
    {
        if(root==null) return true; 
        if(root.val>=max || root.val<=min) return false; 
        boolean left=isValid(root.left, root.val, min);
        boolean right=isValid(root.right, max, root.val);
        if(left && right) return true; 
        return false; 
    }
}

