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
    public int sumNumbers(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root==null) return 0; 
        ArrayList<Integer> result=new ArrayList<Integer>();
        find(root, 0, result );
        int sum=0; 
        for(Integer i: result)
        {
            sum+=i;
        }
        return sum; 
    }
    void find(TreeNode root, int sum, ArrayList<Integer> result )
    {
        if(root==null) return ; 
        sum=sum*10+root.val;
        if(root.left==null && root.right==null)
        {
            result.add(sum); return; 
        }
        if(root.left!=null)
        {
            find(root.left, sum, result);
        }
        if(root.right!=null)
        {
            find(root.right, sum, result);
        }
    }
}
