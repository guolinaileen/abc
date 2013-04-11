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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(head==null) return null; 
        ListNode runner=head, first=null; 
        ArrayList<Integer> list=new ArrayList<Integer>(); 
        while(runner!=null && ( m>0 || n>0 ) )
        {
            if(m==1) first=runner; 
            if(m<=1) list.add(runner.val);
            m--; n--; runner=runner.next;
        }
        for(int i=list.size()-1; i>=0; i--)
        {
            first.val=list.get(i);
            first=first.next; 
        }
        return head; 
    }
}
