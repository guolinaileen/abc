  public static Node reverseLinkedList(Node head)
	{
		if(head==null) return  null; 
		Node tail=reverseLinkedList(head.next);
		if(tail==null)
		{
			headNode=head; 
		}else
		{
			tail.next=head; 
			head.next=null; 
		}
		return head; 
	}
