/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(head==null || head.next==null) return head; 
        ListNode runner=head.next; 
        ListNode pre=head; 
        while(runner!=null)
        {
            if(runner.val==pre.val)
            {
                pre.next=runner.next; 
            }else
            {
                pre=runner; 
            }
            runner=runner.next; 
        }
        return head; 
    }
}
