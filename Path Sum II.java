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
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>(); 
        if(root==null) return result; 
        ArrayList<Integer> p=new ArrayList<Integer>();
        path(result, p, root, sum);
        return result; 
    }
    void path(ArrayList<ArrayList<Integer>> result, ArrayList<Integer>p, TreeNode root, int sum)
    {
        if(root==null) return; 
        if(root.left==null && root.right==null)
        {
            if(root.val==sum) 
            {
            p.add(root.val);
            result.add((ArrayList<Integer>)p.clone());
            p.remove(p.size()-1);
            }
            return ; 
        }
        p.add(root.val); 
        path(result, p, root.left, sum-root.val);
        path(result, p, root.right, sum-root.val);
        p.remove(p.size()-1);
    }
}
