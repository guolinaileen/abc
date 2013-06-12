public static Node merge(Node head)
  {
		  if(head==null ||head.next==null) return head; 
	    int length=0;
	    Node run=head;  
	    while(run!=null)
	    {
	        length++; 
	        run=run.next; 
	    } 
	    Node pre=null; 
	    run=head; 
	    length=length/2; 
	    while(length!=0) 
	    {
	        pre=run; 
	        run=run.next; 
          length--; 
	    }
	    if(pre!=null) pre.next=null; 
	    return mergeSort(head, run);
	}

	public static Node mergeSort(Node first, Node second )
	{
	    Node node1=merge(first);
	    Node node2=merge(second);
	    Node dummy=new Node(0);
	    Node run=dummy; 
	    while(node1!=null && node2!=null)
	    {
	        if(node1.val<node2.val)
	        {
	            run.next=node1; 
	            node1=node1.next; 
	        }else
	        {
	            run.next=node2; 
	            node2=node2.next; 
	        }
	        run=run.next; 
	    }
	   if(node1!=null)
	   {
	        run.next=node1; 
	   }
	   if(node2!=null)
	   {
	        run.next=node2;
	   }
	   return dummy.next; 
	}
