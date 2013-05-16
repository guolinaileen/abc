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
    public ListNode reverseKGroup(ListNode head, int k) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(k==0||k==1||head==null) return head; 
        int count=0;
        ListNode dummy=new ListNode(0);
        dummy.next=head; 
        ListNode pre=dummy;
        while(head!=null)
        {
            count++; 
            ListNode next=head.next; 
            if(count%k==0)
            {
                pre=reverse(pre, head.next);
            }
            head=next; 
        }
        return dummy.next;
    }
    ListNode reverse(ListNode pre, ListNode next)
    {
        ListNode preNode=pre.next; 
        ListNode second=pre.next.next; 
        while(second!=next)
        {
            ListNode first=pre.next; 
            ListNode nextNode=second.next; 
            pre.next=second;
            second.next=first; 
            preNode.next=nextNode; 
            second=nextNode; 
        }
        return preNode; 
    }
}
