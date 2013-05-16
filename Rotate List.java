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
    public ListNode rotateRight(ListNode head, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(head==null||n==0) return head; 
        int length=0;
        ListNode run=head; 
        while(run!=null)
        {
            length++; 
            run=run.next; 
        }
        n=n%length;
        if(n==0) return head; 
        run=head; 
        while(run!=null && n!=0)
        {
            run=run.next; n--; 
        }
        if(run==null) return head; 
        ListNode pre=head; 
        while(run.next!=null)
        {
            pre=pre.next; run=run.next; 
        }
        ListNode newHead=pre.next; 
        run.next=head; 
        pre.next=null; 
        return newHead; 
    }
}
