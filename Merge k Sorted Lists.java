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
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(lists.size()==0) return null; 
        Comparator<ListNode> comp=new Comparator<ListNode>()
        {
            @Override
            public int compare(ListNode l1, ListNode l2)
            {
                return new Integer (l1.val).compareTo(new Integer (l2.val)); 
            }
        }; //minheap
        PriorityQueue<ListNode> pq=new PriorityQueue<ListNode>(lists.size(), comp);
        for(int i=0; i<lists.size(); i++)
        {
            ListNode node=lists.get(i);
            if(node!=null)
            pq.add(node);
        }
        ListNode head=null, cur=null; 
        while(!pq.isEmpty())
        {
            if(head==null)
            {
                head=pq.poll(); 
                cur=head; 
                if(cur.next!=null)
                {
                    pq.add(cur.next);
                }
            }else
            {
                ListNode newNode=pq.poll();
                cur.next=newNode;
                cur=newNode; 
                if(cur.next!=null)
                {
                    pq.add(cur.next);
                }
            }
        }
        return head; 
    }
}
