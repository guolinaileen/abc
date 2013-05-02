public class Solution
{
public static void main(String[] args) {

  	Node a1=new Node(1); 
		Node a2=new Node(2); 
		Node a3=new Node(3); 
		Node a4=new Node(4); 
		Node a5=new Node(5); 
		Node a6=new Node(6); 
		Node a7=new Node(7);
		a1.next=a2;  a1.random=a3; 
		a2.next=a3; 
		a3.next=a4; 
		a4.next=a5; a4.random=a2; 
		a5.next=a6; 
		a6.next=a7; a6.random=a5; 
		Node resultNode=copyLinkedlist(a1); 
		while(resultNode!=null)
		{
			System.out.println(resultNode.val);
			if(resultNode.random!=null) 
				System.out.println("random: "+ resultNode.random.val);
			resultNode=resultNode.next; 
		}
}

  static Node copyLinkedlist(Node first)
	{
		if(first==null) return null; 
		Node runner=first; 
//insert a new node after each node
		while(runner!=null)
		{
			Node next=runner.next;
			Node newNode=new Node(runner.val);
			runner.next=newNode; 
			newNode.next=next; 
			runner=runner.next.next;
		}
		runner=first; 
//change the random, careful about the null value
		while(runner!=null && runner.next!=null)
		{
			if(runner.random!=null) runner.next.random=runner.random.next;
			runner=runner.next.next; 
		}
		Node result=first.next; 
		runner=first; 
//restore the new list and the old list
		while(first!=null && first.next!=null)
		{
			Node next=first.next; 
			first.next=next.next; 
			if(next.next!=null) next.next=next.next.next; 
			first=first.next; 
			next=next.next; 
		}
		return result; 
	}


}
