//http://www.geeksforgeeks.org/delete-nodes-which-have-a-greater-value-on-right-side/

public static Node deleteNodes(Node head, Node pre)
	{
		if(head==null) return head; 
		Node tail=deleteNodes(head.next, head);
		if(tail==null) return head; 
		if(head.val<tail.val) 
		{
			if(pre!=null) pre.next=tail;  //delete head because the value of head is smaller than tail.
			return tail; 
		}
		return head; 
	}
