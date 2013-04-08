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
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
        if(root==null) return list; 
        ArrayList<TreeNode> T=new ArrayList<TreeNode>();
        T.add(root);
        ArrayList<TreeNode> S=new ArrayList<TreeNode>(); 
        ArrayList<Integer> sub=new ArrayList<Integer>();
        while(T.size()!=0)
        {
            TreeNode top=T.remove(0);             
            sub.add(top.val);
            if(top.left!=null) S.add(top.left);
            if(top.right!=null) S.add(top.right);
            if(T.size()==0)
            {
                list.add(sub);
                sub=new ArrayList<Integer>();
                T=new ArrayList<TreeNode>(S);
                S=new ArrayList<TreeNode>(); 
            }
        }
        return list; 
    }
}
