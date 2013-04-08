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
    TreeNode n1; 
    TreeNode n2; 
    TreeNode pre; 
    public void recoverTree(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        n1=null; n2=null; pre=null; 
        inOrder(root);
        if(n1!=null && n2!=null)
        {
         int temp=n1.val;
         n1.val=n2.val; 
         n2.val=temp; 
        }
    }
    void inOrder(TreeNode root)
    {
        if(root==null) return ; 
        inOrder(root.left);
        if(pre!=null && pre.val>root.val)
        {
            /*
            start from n2=root; 
            */
            n2=root; 
            if(n1==null)
            {
                n1=pre; 
            }
        }
        pre=root; 
        inOrder(root.right);
    }
    
}
