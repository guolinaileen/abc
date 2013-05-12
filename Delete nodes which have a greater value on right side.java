//http://www.geeksforgeeks.org/delete-nodes-which-have-a-greater-value-on-right-side/

public static Node deleteNodes(Node head, Node pre)
	{
		if(head==null) return head; 
		Node tail=deleteNodes(head.next, head);
		if(tail==null) return head; 
		if(head.val<tail.val) 
		{
			if(pre!=null) pre.next=tail; 
			return tail; 
			}
		return head; 
	}
