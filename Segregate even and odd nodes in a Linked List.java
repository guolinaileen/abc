public static Node segregatLinkedList(Node head)
  {
		if(head==null) return head ;
		Node dummyEven=new Node(0);
		dummyEven.next=head; 
		Node pre=dummyEven; 
		Node dummyOdd=new Node(0);
		Node dummyOddRun=dummyOdd;
		while(head!=null)
		{
			if(head.val%2==0)
			{
				pre=head; 
				head=head.next; 
				}
			else
			{
				Node next=head.next; 
				dummyOddRun.next=head; 
				dummyOddRun=dummyOddRun.next; 
				dummyOddRun.next=null;
				pre.next=next; 
				head=next; 
			}
		}
		if(pre!=null) pre.next=dummyOdd.next; 
		return dummyEven.next; 
	}
