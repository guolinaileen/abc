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
    public ListNode partition(ListNode head, int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode dummy1=new ListNode(0);
        ListNode first=null; 
        ListNode dummy2=new ListNode(0);
        ListNode second=null; 
        while(head!=null)
        {
            ListNode next=head.next; 
            if(head.val<x)
            {
                if(first==null)
                {
                    first=head; 
                    first.next=null; 
                    dummy1.next=first;
                }else
                {
                    first.next=head; 
                    first=first.next; 
                    first.next=null; 
                }
            }else
            {
                if(second==null)
                {
                    second=head; 
                    second.next=null; 
                    dummy2.next=second; 
                }else
                {
                    second.next=head; 
                    second=second.next; 
                    second.next=null; 
                }
            }
            head=next;
        }
        if(first!=null) first.next=dummy2.next; 
        else dummy1.next=dummy2.next; 
        return dummy1.next; 
    }
}
