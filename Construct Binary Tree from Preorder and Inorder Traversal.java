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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(preorder.length==0 && inorder.length==0) return null; 
        HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
        for(int i=0; i<inorder.length; i++)
        {
            map.put(inorder[i], i); //map value and index, so we can easy find the right one. 
        }
        return find(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1, map);
    }
    
    TreeNode find(int [] preorder, int pstart, int pend, int []inorder, int istart, int iend, HashMap<Integer, Integer> match)
    {
        if(pstart>pend || istart>iend) return null; 
        TreeNode root=new TreeNode(preorder[pstart]);
        int indexI=match.get(preorder[pstart]);
        root.left=find(preorder, pstart+1, pend-(iend-indexI), inorder, istart, indexI-1, match);
        root.right=find(preorder, pend-(iend-indexI)+1, pend, inorder, indexI+1, iend, match);
        return root; 
    }
}
