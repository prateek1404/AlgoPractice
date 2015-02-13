public class Driver
{
public static Node headRev;
public static void main(String args[])
{
	Node n = new Node(5);
	LinkedList list = new LinkedList(n);
	list.insert(4);
	list.insert(34);
	list.insert(11);
	list.insert(10);
	//list.head= list.reverseList(list.head);
	list.printList();
	//reverse(n);
	//list.head = headRev;
	//System.out.println("reversed");
	//list.printList();
	//printMiddle(headRev);
	Node sorted = mergeSort(list.head);
	while(sorted!=null)
	{
		System.out.println(sorted.value);
		sorted = sorted.next;
	}	
	
}
public static Node reverse(Node head)
{
		if(head.next==null)
		{
			headRev = head;
			return head;
		}
		Node nextNode = head.next;
		head.next= null;
		Node returnNode = reverse(nextNode);
		nextNode.next = head;
		return head;
}
public static void printMiddle(Node head)
{
	Node slow = head;
	Node fast = head.next;
	while(fast!=null && fast.next!=null)
	{
		slow = slow.next;
		fast = fast.next.next;

	}
	System.out.println(slow.value);
	

}
public static Node mergeSort(Node node)
{
	if(node==null)
	{
		return null;

	}
	else if(node.next==null)
	{
		return node;
	}
	else
	{
		Node middle = findMiddle(node);
		Node ar1 = mergeSort(middle.next);
		middle.next = null;
		Node ar2 = mergeSort(node);
		return merge(ar1,ar2);

	}


}
public static Node merge(Node ar1, Node ar2)
{
	if(ar1==null && ar2==null)
	{
		return null;
	}
	else if(ar1==null)
	{
		return ar2;
	}
	else if(ar2==null)
	{
		return ar1;
	}
	else
	{
		if(ar1.value<ar2.value)
		{
			Node temp = ar1.next;
			ar1.next = null;
			ar1.next = merge(temp,ar2);
			return ar1;
		}
		else
		{
			Node temp = ar2.next;
			ar2.next = null;
			ar2.next = merge(temp,ar1);
			return ar2;

		}


	}
	


}
public static Node findMiddle(Node n)
{
	if(n==null)
	{
		return null;
	}
	Node slow = n;
	Node fast = n.next;
	while(fast!=null && fast.next!=null)
	{
		slow = slow.next;
		fast  = fast.next;
	}	
	return slow;

}

}
