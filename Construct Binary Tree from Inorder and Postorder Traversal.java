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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(inorder.length==0 && postorder.length==0) return null; 
        HashMap<Integer, Integer> map=new HashMap<Integer, Integer>(); 
        for(int i=0; i<inorder.length; i++)
        {
            map.put(inorder[i], i);
        }
        return  find(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1, map); 
    }
    TreeNode find(int[] inorder, int istart, int iend, int [] postorder, int pstart, int pend, HashMap<Integer, Integer> match)
    {
        if(istart>iend || pstart>pend) return null; 
        TreeNode root=new TreeNode(postorder[pend]);
        int indexI=match.get(postorder[pend]);
        root.left=find(inorder, istart, indexI-1, postorder, pstart, pstart+(indexI-istart)-1, match); 
        root.right=find(inorder, indexI+1, iend, postorder, pstart+(indexI-istart), pend-1, match);
        return root; 
    }
}
