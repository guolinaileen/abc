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
    public void flatten(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root==null) return ;
        TreeNode L=root.left; 
        TreeNode R=root.right; 
        if(L!=null)
        {           
            root.left=null; 
            root.right=L; 
            TreeNode rightM=rightMost(L);
            rightM.right=R;
            flatten(L);
        }else
        {
            flatten(R);
        }
    }
    TreeNode rightMost(TreeNode root)
    {
        if(root==null) return null; 
        TreeNode runner=root; 
        while(runner.right!=null)
        {
            runner=runner.right; 
        }
        return runner; 
    }
}
