public class Driver
{
public static Node headRev;
public static void main(String args[])
{
	Node n = new Node(5);
	LinkedList list = new LinkedList(n);
	list.insert(4);
	list.insert(6);
	list.insert(10);
	list.insert(11);
	//list.head= list.reverseList(list.head);
	list.printList();
	reverse(n);
	list.head = headRev;
	System.out.println("reversed");
	list.printList();
	printMiddle(headRev);
	
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

}
