/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root==null) return ; 
        TreeLinkNode L=root.left;
        TreeLinkNode R=root.right;
        if(L!=null) L.next=R; 
        if(R!=null && root.next!=null)
        {
            TreeLinkNode next=root.next;
            R.next=next.left;
        }
        connect(root.left);
        connect(root.right);
        connect(root.next);
    }
}
