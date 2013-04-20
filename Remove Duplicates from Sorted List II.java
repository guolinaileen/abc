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
        ListNode dummy=new ListNode(0); 
        dummy.next=head;
        boolean det=false; 
        ListNode pre=dummy; 
        ListNode wait=head; 
        ListNode runner=head.next; 
        while(runner!=null)
        {
            if(runner.val==wait.val)
            {
                det=true; 
                wait.next=runner.next; 
            }else
            {
                if(det)
                {
                    pre.next=runner; 
                    wait=runner;
                    det=false; 
                }else
                {
                    pre=wait; 
                    wait=runner;
                }
            }
            runner=runner.next; 
        }
        if(det) pre.next=null; 
        return dummy.next; 
    }
}
