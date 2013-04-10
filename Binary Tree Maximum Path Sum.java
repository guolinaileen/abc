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
        int L=maxSum(root.left);
        int R=maxSum(root.right);
        int subMax=Math.max(Math.max(root.val ,L+R+root.val),root.val+ Math.max(L, R));
        max=Math.max(max,subMax);
        return Math.max(root.val, root.val+Math.max(L, R));
    }
}
