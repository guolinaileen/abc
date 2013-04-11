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
        if(head==null || n==0) return head;
        if(head.next==null) return head; 
        ListNode runner=head; 
        int counter=1; 
        while(counter<n)
        {
            if(runner.next==null) runner=head; 
            else runner=runner.next; 
            counter++; 
        }
        ListNode cur=head; 
        ListNode pre=null; 
        while(runner.next!=null)
        {
            pre=cur; 
            cur=cur.next; 
            runner=runner.next;
        }
        if(pre!=null) pre.next=null; 
        ListNode newHead=cur;
        while(cur.next!=null)
        {
            cur=cur.next; 
        }
        if(newHead!=head) cur.next=head; 
        return newHead; 
    }
}
