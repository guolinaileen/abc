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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode dummy=new ListNode(0);
        ListNode runner=dummy; 
        while(l1!=null && l2!=null)
        {
            if(l1.val<l2.val)
            {
                runner.next=l1; l1=l1.next; 
            }else
            {
                runner.next=l2; l2=l2.next; 
            }
            runner=runner.next; 
        }
        if(l1!=null) runner.next=l1; 
        if(l2!=null) runner.next=l2; 
        return dummy.next; 
    }
}
