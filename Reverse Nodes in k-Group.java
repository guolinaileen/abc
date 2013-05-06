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
        if(k<=1) return head; 
        ListNode dummy=new ListNode(0);
        int counter=1; 
        dummy.next=head; 
        ListNode pre=dummy; 
        while(head!=null)
        {
            /*smart point is using %*/
            if(counter%k==0)
            {
                pre=reverse(pre, head);
                head=pre;
            }
            head=head.next; 
            counter++; 
        }
        return dummy.next; 
    }
    //return the end
    ListNode reverse(ListNode pre, ListNode end)
    {
        ListNode runner=pre.next.next;
        ListNode preNext=null;
        ListNode last=pre.next; 
        
        while(runner!=end)
        {
            preNext=pre.next;
            ListNode next=runner.next;
            pre.next=runner; 
            runner.next=preNext;
            runner=next; 
        }
        preNext=pre.next; 
        last.next=runner.next; 
        pre.next=runner; 
        runner.next=preNext; 
        return last; 
    }
}
