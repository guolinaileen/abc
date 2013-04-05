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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        return addTwo(l1,  l2, 0); 
    }
    ListNode addTwo(ListNode l1, ListNode l2, int carry)
    {
        if(l1==null && l2==null && carry==0) return null; 
        if(l1==null && l2==null && carry==1) return new ListNode(1);
        int a=0, b=0; 
        if(l1!=null) a=l1.val; 
        if(l2!=null) b=l2.val;
        int sum=a+b+carry; 
        ListNode head=new ListNode(sum%10);
        head.next=addTwo((l1!=null? l1.next: null), (l2!=null? l2.next: null), sum/10 );
        return head; 
    }
}
