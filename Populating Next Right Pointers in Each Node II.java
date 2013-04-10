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
        if(root!=null) root.next=null; 
        while(root!=null)
        {
            TreeLinkNode r=root;
            while(r!=null)
            {
                if(r.left!=null)
                {
                    if(r.right!=null) r.left.next=r.right; 
                    else r.left.next=findNext(r);
                }
                if(r.right!=null)
                {
                    r.right.next=findNext(r);
                }
                r=r.next; 
            }
            if (root.left!=null) root=root.left; 
            else if(root.right!=null) root=root.right;
            else root=root.next; 
        }
        return ;
    }
    TreeLinkNode findNext(TreeLinkNode parent)
    {
        TreeLinkNode runner=parent;
        while(runner.next!=null)
        {
            runner=runner.next;
            if(runner.left!=null) return runner.left;
            if(runner.right!=null) return runner.right;
        }
        return null; 
    }
}
