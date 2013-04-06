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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int counter=0; 
        ListNode runner=head; 
        while(counter!=n)
        {
            runner=runner.next; counter++; 
        }
        if(runner==null) return head.next; 
        ListNode cur=head; 
        while(runner.next!=null)
        {
            runner=runner.next;
            cur=cur.next; 
        }
        cur.next=cur.next.next; 
        return head; 
    }
}
