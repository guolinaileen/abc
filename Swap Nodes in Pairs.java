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
    public ListNode swapPairs(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode dummy=new ListNode(0);
        dummy.next=head; 
        ListNode run=dummy; 
        while(head!=null && head.next!=null )
        {
            ListNode next=head.next; 
            ListNode nextNext=head.next.next; 
            run.next=next; 
            run=run.next; 
            run.next=head; 
            run=run.next; 
            head.next=nextNext; 
            head=head.next; 
        }
        return dummy.next; 
    }
}
